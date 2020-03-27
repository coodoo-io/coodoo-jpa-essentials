package io.coodoo.framework.jpa.boundary.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import io.coodoo.framework.jpa.boundary.VersionAnnotated;
import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedDeletedAtEntity;

/**
 * Base entity providing identification, automatically sets creation/update/deletion timestamps and optimistic concurrency control
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
 * <th>OCC</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>createdAt</td>
 * <td>updatedAt</td>
 * <td>deletedAt</td>
 * <td>version</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>LocalDateTime</td>
 * <td>LocalDateTime</td>
 * <td>LocalDateTime</td>
 * <td>Integer</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>created_at</td>
 * <td>updated_at</td>
 * <td>deleted_at</td>
 * <td>version</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedDeletedAtEntity}
 */
@Deprecated
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class RevisionDatesDmOccEntity extends RevisionDatesDmEntity implements VersionAnnotated {

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
        return "RevisionDatesDmOccEntity [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ", version="
                        + version + "]";
    }

}
