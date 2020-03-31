package io.coodoo.framework.jpa.control;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import io.coodoo.framework.jpa.boundary.CreatedAt;
import io.coodoo.framework.jpa.boundary.CreatedBy;
import io.coodoo.framework.jpa.boundary.DeletedAt;
import io.coodoo.framework.jpa.boundary.DeletedBy;
import io.coodoo.framework.jpa.boundary.RevisionUser;
import io.coodoo.framework.jpa.boundary.UpdatedAt;
import io.coodoo.framework.jpa.boundary.UpdatedBy;

/**
 * Intercepts JPA events to set revision information
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class JpaEssentialsEntityListener {

    @Inject
    Instance<RevisionUser> revisionUserInstance;

    @PrePersist
    public void create(CreatedAt entity) {

        entity.setCreatedAt(JpaEssentialsConfig.now());

        if (entity instanceof CreatedBy) {
            ((CreatedBy) entity).setCreatedBy(getUserId());
        }
        if (entity instanceof UpdatedAt && JpaEssentialsConfig.FILL_UPDATED_ON_CREATION) {
            update((UpdatedAt) entity);
        }
    }

    @PreUpdate
    public void update(UpdatedAt entity) {

        if (entity instanceof DeletedAt && ((DeletedAt) entity).markedAsDeleted()) {

            DeletedAt deletedAtEntity = ((DeletedAt) entity);

            // the date should already be set, but who knows if it is correct...
            deletedAtEntity.setDeletedAt(JpaEssentialsConfig.now());

            if (deletedAtEntity instanceof DeletedBy && ((DeletedBy) deletedAtEntity).getDeletedBy() == null) {
                ((DeletedBy) deletedAtEntity).setDeletedBy(getUserId());
            }
        } else {

            entity.setUpdatedAt(JpaEssentialsConfig.now());

            if (entity instanceof UpdatedBy) {
                ((UpdatedBy) entity).setUpdatedBy(getUserId());
            }
        }
    }

    public Long getUserId() {
        RevisionUser revisionUser = revisionUserInstance.get();
        return revisionUser.getUserId();
    }

}
