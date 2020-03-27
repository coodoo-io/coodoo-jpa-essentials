package io.coodoo.framework.jpa.boundary.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import io.coodoo.framework.jpa.boundary.CreatedBy;
import io.coodoo.framework.jpa.boundary.UpdatedBy;
import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedAtByEntity;

/**
 * Base entity providing identification and automatically sets creation/update timestamps and user IDs
 * 
 * <br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Fields</th>
 * <th>ID</th>
 * <th>Creation Date</th>
 * <th>Creation User</th>
 * <th>Update Date</th>
 * <th>Update User</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>createdAt</td>
 * <td>createdBy</td>
 * <td>updatedAt</td>
 * <td>updatedBy</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>Long</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>created_at</td>
 * <td>created_by</td>
 * <td>updated_at</td>
 * <td>updated_by</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdCreatedUpdatedAtByEntity}
 */
@Deprecated
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class RevisionEntity extends RevisionDatesEntity implements CreatedBy, UpdatedBy {

    @Column(name = "created_by")
    protected Long createdBy;

    @Column(name = "updated_by")
    protected Long updatedBy;

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "AbstractRevisionEntity [id=" + id + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy="
                        + updatedBy + "]";
    }

}
