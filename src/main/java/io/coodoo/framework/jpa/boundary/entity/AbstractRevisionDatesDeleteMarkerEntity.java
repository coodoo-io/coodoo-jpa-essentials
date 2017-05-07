package io.coodoo.framework.jpa.boundary.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Base entity providing identification and automatically sets creation/update/deletion timestamps
 * 
 * <br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Fields</th>
 * <th>ID</th>
 * <th>Creation Date</th>
 * <th>Update Date</th>
 * <th>Deletion Date</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>createdAt</td>
 * <td>updatedAt</td>
 * <td>deletedAt</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>LocalDateTime</td>
 * <td>LocalDateTime</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>created_at</td>
 * <td>updated_at</td>
 * <td>deleted_at</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractRevisionDatesDeleteMarkerEntity extends AbstractRevisionDatesEntity {

    @Column(name = "deleted_at")
    protected LocalDateTime deletedAt;

    public boolean isDeleted() {
        return deletedAt != null;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "AbstractRevisionDatesDeleteMarkerEntity [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
    }

}
