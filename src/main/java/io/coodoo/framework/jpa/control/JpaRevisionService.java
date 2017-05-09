package io.coodoo.framework.jpa.control;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.ejb.Stateless;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import io.coodoo.framework.jpa.boundary.RevisionUser;
import io.coodoo.framework.jpa.boundary.entity.RevisionDatesEntity;
import io.coodoo.framework.jpa.boundary.entity.RevisionDmEntity;
import io.coodoo.framework.jpa.boundary.entity.RevisionEntity;

/**
 * Fills the entities revision attributes
 *
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Entity</th>
 * <th>Creation Date</th>
 * <th>Creation User</th>
 * <th>Update Date</th>
 * <th>Update User</th>
 * <th>Delete Date</th>
 * <th>Delete User</th>
 * </tr>
 * <tr>
 * <td>RevisionDatesEntity</td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * <td></td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>RevisionDatesDmEntity</td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>RevisionEntity</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td></td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>RevisionDmEntity</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * </table>
 *
 *
 * @author coodoo GmbH (coodoo.io)
 */
@Stateless
public class JpaRevisionService {

    @Inject
    Instance<RevisionUser> revisionUserInstance;

    public void markCreation(RevisionDatesEntity entity) {

        entity.setCreatedAt(now());

        if (entity instanceof RevisionEntity) {
            ((RevisionEntity) entity).setCreatedBy(getUserId());
        }
    }

    public void markUpdate(RevisionDatesEntity entity) {

        if (entity instanceof RevisionDmEntity
                        // triggered by a set deletion marker field
                        && (((RevisionDmEntity) entity).getDeletedAt() != null || ((RevisionDmEntity) entity).getDeletedBy() != null)) {

            ((RevisionDmEntity) entity).setDeletedAt(now());
            ((RevisionDmEntity) entity).setDeletedBy(getUserId());
            return;
        }

        entity.setUpdatedAt(now());

        if (entity instanceof RevisionEntity) {
            ((RevisionEntity) entity).setUpdatedBy(getUserId());
        }
    }

    private Long getUserId() {
        RevisionUser revisionUser = revisionUserInstance.get();
        return revisionUser.getUserId();
    }

    private LocalDateTime now() {
        return LocalDateTime.now(ZoneId.of("UTC"));
    }

}
