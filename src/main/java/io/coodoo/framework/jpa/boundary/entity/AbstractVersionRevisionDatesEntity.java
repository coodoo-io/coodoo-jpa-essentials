package io.coodoo.framework.jpa.boundary.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import io.coodoo.framework.jpa.control.JpaRevisionEntityListener;

/**
 * Base entity providing identification, optimistic concurrency control and automatically sets creation/update timestamps
 * 
 * <br>
 * <br>
 *
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Fields</th>
 * <th>ID</th>
 * <th>OCC</th>
 * <th>Creation Date</th>
 * <th>Update Date</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>version</td>
 * <td>createdAt</td>
 * <td>updatedAt</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>Integer</td>
 * <td>LocalDateTime</td>
 * <td>LocalDateTime</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>version</td>
 * <td>created_at</td>
 * <td>updated_at</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
@EntityListeners(JpaRevisionEntityListener.class)
public abstract class AbstractVersionRevisionDatesEntity extends AbstractVersionEntity {

    @Column(name = "created_at", nullable = false)
    protected LocalDateTime createdAt;

    @Column(name = "updated_at")
    protected LocalDateTime updatedAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "AbstractVersionRevisionDatesEntity [id=" + id + ", version=" + version + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

}
