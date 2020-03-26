package io.coodoo.framework.jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import io.coodoo.framework.jpa.boundary.DeletedAt;
import io.coodoo.framework.jpa.boundary.JpaEssentialsEntityListener;

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
 * <td><b>Update Date</b></td>
 * <td>{@link #updatedAt}</td>
 * <td>{@link LocalDateTime}</td>
 * <td><code>updated_at</code></td>
 * <td>The current time is set the moment this entity is updated ({@link PreUpdate} callback)</td>
 * </tr>
 * <tr>
 * <td><b>Deletion Date</b></td>
 * <td>{@link #deletedAt}</td>
 * <td>{@link LocalDateTime}</td>
 * <td><code>deleted_at</code></td>
 * <td>The current time is set to mark this entity as deleted ({@link PreUpdate} callback). You can mark it by calling {@link #markAsDeleted()}</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractCreatedUpdatedDeletedAtEntity extends AbstractCreatedUpdatedAtEntity implements DeletedAt {

    @Column(name = "deleted_at")
    protected LocalDateTime deletedAt;

    // FIXME prüfen ob das überhaupt per @PrePersist greift und wenn nicht, dann ggf, das @Transient entfernen und einen anderen weg finden...
    @Transient
    private boolean markedAsDeleted = false;

    @Override
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * To just mark an entity as deleted, call this method instead of {@link EntityManager#remove(Object)}. The fields {@link #deletedAt} and {@link #deletedBy}
     * will be set to mark the deletion. <br>
     * On the other hand you have to provide your queries with something like '<code>deleted_at IS NULL</code>' to avoid 'marked as deleted' entries! for those
     * fields if <code>null</code>.
     */
    @Override
    public void markAsDeleted() {
        markedAsDeleted = true;
    }

    /**
     * @return <code>true</code> if this entity pretends to be deleted. If <code>false</code> you can doom it by calling {@link #markAsDeleted()}. <br>
     *         You can check {@link #deletedAt} for when it was marked as deleted and {@link #deletedBy} for who did it.
     */
    @Override
    public boolean isMarkedAsDeleted() {
        return markedAsDeleted || deletedAt != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractCreatedUpdatedDeletedAtEntity [createdAt=");
        builder.append(createdAt);
        builder.append(", updatedAt=");
        builder.append(updatedAt);
        builder.append(", deletedAt=");
        builder.append(deletedAt);
        builder.append(", markedAsDeleted=");
        builder.append(markedAsDeleted);
        builder.append("]");
        return builder.toString();
    }

}
