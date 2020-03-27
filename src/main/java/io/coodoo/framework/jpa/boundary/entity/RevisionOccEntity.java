package io.coodoo.framework.jpa.boundary.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import io.coodoo.framework.jpa.boundary.VersionAnnotated;
import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedAtByEntity;

/**
 * Base entity providing identification, automatically sets creation/update timestamps and user IDs and optimistic concurrency control
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
 * <th>OCC</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>createdAt</td>
 * <td>createdBy</td>
 * <td>updatedAt</td>
 * <td>updatedBy</td>
 * <td>version</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>Long</td>
 * <td>Integer</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>created_at</td>
 * <td>created_by</td>
 * <td>updated_at</td>
 * <td>updated_by</td>
 * <td>version</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedAtByEntity}
 */
@Deprecated
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class RevisionOccEntity extends RevisionEntity implements VersionAnnotated {

    @Version
    @Column(name = "version")
    protected Integer version = 0;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "RevisionOccEntity [id=" + id + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy
                        + ", version=" + version + "]";
    }

}
