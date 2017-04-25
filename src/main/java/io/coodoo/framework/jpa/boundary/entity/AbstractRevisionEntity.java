package io.coodoo.framework.jpa.boundary.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Base entity providing identification and revision information.
 * 
 * </br>
 * </br>
 * 
 * <table border="1">
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
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractRevisionEntity extends AbstractRevisionDatesEntity {

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
        return "AbstractRevisionEntity [createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", id="
                        + id + "]";
    }

}
