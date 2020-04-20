package io.coodoo.framework.jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

import io.coodoo.framework.jpa.boundary.IdAnnotated;
import io.coodoo.framework.jpa.boundary.RevisionUser;
import io.coodoo.framework.jpa.boundary.VersionAnnotated;
import io.coodoo.framework.jpa.control.JpaEssentialsEntityListener;

/**
 * This {@link MappedSuperclass} is {@link Serializable}, attached to the {@link JpaEssentialsEntityListener} and provides the fields in this table:<br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tbody>
 * <tr>
 * <th></th>
 * <th>Field</th>
 * <th>Type</th>
 * <th>Column</th>
 * <th>Info</th>
 * </tr>
 * <tr>
 * <td><b>ID</b></td>
 * <td>{@link #id}</td>
 * <td>{@link Long}</td>
 * <td><code>id</code></td>
 * <td>This {@link Id} annotated field uses the {@link GeneratedValue} strategy {@link GenerationType#IDENTITY}. It comes with {@link #hashCode()} and
 * {@link #equals(Object)} methods based on the {@link #id} field</td>
 * </tr>
 * <tr>
 * <td><b>Creation Date</b></td>
 * <td>{@link #createdAt}</td>
 * <td>{@link LocalDateTime}</td>
 * <td><code>created_at</code></td>
 * <td>The current time is set the moment this entity is persisted ({@link PrePersist} callback)</td>
 * </tr>
 * <tr>
 * <td><b>Creation User</b></td>
 * <td>{@link #createdBy}</td>
 * <td>{@link Long}</td>
 * <td><code>created_by</code></td>
 * <td>The user ID (if provided by an implementation of {@link RevisionUser}) is set the moment this entity is persisted ({@link PrePersist} callback)</td>
 * </tr>
 * <tr>
 * <td><b>Update Date</b></td>
 * <td>{@link #updatedAt}</td>
 * <td>{@link LocalDateTime}</td>
 * <td><code>updated_at</code></td>
 * <td>The current time is set the moment this entity is updated ({@link PreUpdate} callback)</td>
 * </tr>
 * <tr>
 * <td><b>Update User</b></td>
 * <td>{@link #updatedBy}</td>
 * <td>{@link Long}</td>
 * <td><code>updated_by</code></td>
 * <td>The user ID (if provided by an implementation of {@link RevisionUser}) is set the moment this entity is updated ({@link PreUpdate} callback)</td>
 * </tr>
 * <tr>
 * <td><b>OCC</b></td>
 * <td>{@link #version}</td>
 * <td>{@link Integer}</td>
 * <td><code>version</code></td>
 * <td>Optimistic concurrency control (OCC) is provided by {@link Version}</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractIdOccCreatedUpdatedAtByEntity extends AbstractCreatedUpdatedAtByEntity implements IdAnnotated, VersionAnnotated {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Version
    @Column(name = "version")
    protected Integer version = 0;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Integer getVersion() {
        return version;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractIdOccCreatedUpdatedAtByEntity [id=");
        builder.append(id);
        builder.append(", version=");
        builder.append(version);
        builder.append(", createdAt=");
        builder.append(createdAt);
        builder.append(", createdBy=");
        builder.append(createdBy);
        builder.append(", updatedAt=");
        builder.append(updatedAt);
        builder.append(", updatedBy=");
        builder.append(updatedBy);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        if (getId() != null) {
            return getId().hashCode();
        } else {
            return super.hashCode();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractIdOccCreatedUpdatedAtByEntity)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (((AbstractIdOccCreatedUpdatedAtByEntity) obj).getId() == null) {
            return false;
        }
        return ((AbstractIdOccCreatedUpdatedAtByEntity) obj).getId().equals(getId());
    }

}
