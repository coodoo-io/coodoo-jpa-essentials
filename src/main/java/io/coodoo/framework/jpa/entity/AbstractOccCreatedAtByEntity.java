package io.coodoo.framework.jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

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
public abstract class AbstractOccCreatedAtByEntity extends AbstractCreatedAtByEntity implements VersionAnnotated {

    @Version
    @Column(name = "version")
    protected Integer version = 0;

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
        builder.append("AbstractOccCreatedAtByEntity [version=");
        builder.append(version);
        builder.append(", createdAt=");
        builder.append(createdAt);
        builder.append(", createdBy=");
        builder.append(createdBy);
        builder.append("]");
        return builder.toString();
    }

}
