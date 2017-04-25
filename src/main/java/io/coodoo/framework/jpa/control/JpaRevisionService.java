package io.coodoo.framework.jpa.control;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.ejb.Stateless;
import javax.inject.Inject;

import io.coodoo.framework.jpa.boundary.RevisionUser;
import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionDatesEntity;
import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionDeleteMarkerEntity;
import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionEntity;

/**
 * Fills the entites revision attributes
 * 
 * <table border="1">
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
 * <td>AbstractRevisionDatesEntity</td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * <td></td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>AbstractRevisionDatesDeleteMarkerEntity</td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * <td>X</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>AbstractRevisionEntity</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td></td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>AbstractRevisionDeleteMarkerEntity</td>
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
    RevisionUser revisionUser;

    public void markCreation(AbstractRevisionDatesEntity entity) {

        entity.setCreatedAt(now());

        if (entity instanceof AbstractRevisionEntity) {
            ((AbstractRevisionEntity) entity).setCreatedBy(revisionUser.getUserId());
        }
    }

    public void markUpdate(AbstractRevisionDatesEntity entity) {

        if (entity instanceof AbstractRevisionDeleteMarkerEntity
                        // triggered by a set deletion marker field
                        && (((AbstractRevisionDeleteMarkerEntity) entity).getDeletedAt() != null
                                        || ((AbstractRevisionDeleteMarkerEntity) entity).getDeletedBy() != null)) {

            ((AbstractRevisionDeleteMarkerEntity) entity).setDeletedAt(now());
            ((AbstractRevisionDeleteMarkerEntity) entity).setDeletedBy(revisionUser.getUserId());
        }

        entity.setUpdatedAt(now());

        if (entity instanceof AbstractRevisionEntity) {
            ((AbstractRevisionEntity) entity).setUpdatedBy(revisionUser.getUserId());
        }
    }

    private LocalDateTime now() {
        return LocalDateTime.now(ZoneId.of("UTC"));
    }

}
