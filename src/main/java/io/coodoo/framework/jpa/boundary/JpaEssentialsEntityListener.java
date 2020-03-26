package io.coodoo.framework.jpa.boundary;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import io.coodoo.framework.jpa.control.JpaEssentialsConfig;

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

        entity.setCreatedAt(now());

        if (entity instanceof CreatedBy) {
            ((CreatedBy) entity).setCreatedBy(getUserId());
        }
        if (entity instanceof UpdatedAt && JpaEssentialsConfig.FILL_UPDATED_ON_CREATION) {
            update((UpdatedAt) entity);
        }
    }

    @PreUpdate
    public void update(UpdatedAt entity) {

        entity.setUpdatedAt(now());

        if (entity instanceof UpdatedBy) {
            ((UpdatedBy) entity).setUpdatedBy(getUserId());
        }
        if (entity instanceof DeletedAt && ((DeletedAt) entity).isMarkedAsDeleted()) {

            DeletedAt deletedAtEntity = ((DeletedAt) entity);

            if (deletedAtEntity.getDeletedAt() == null) {
                deletedAtEntity.setDeletedAt(now());
            }
            if (deletedAtEntity instanceof DeletedBy && ((DeletedBy) deletedAtEntity).getDeletedBy() == null) {
                ((DeletedBy) deletedAtEntity).setDeletedBy(getUserId());
            }
        }
    }

    public Long getUserId() {
        RevisionUser revisionUser = revisionUserInstance.get();
        return revisionUser.getUserId();
    }

    public LocalDateTime now() {
        return LocalDateTime.now(ZoneId.of(JpaEssentialsConfig.LOCAL_DATE_TIME_ZONE));
    }

}
