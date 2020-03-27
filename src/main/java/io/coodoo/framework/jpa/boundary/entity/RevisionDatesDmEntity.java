package io.coodoo.framework.jpa.boundary.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import io.coodoo.framework.jpa.boundary.DeletedAt;
import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtEntity;

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
 * @deprecated use {@link AbstractIdCreatedUpdatedDeletedAtEntity}
 */
@Deprecated
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class RevisionDatesDmEntity extends RevisionDatesEntity implements DeletedAt {

    @Column(name = "deleted_at")
    protected LocalDateTime deletedAt;

    // FIXME prüfen ob das überhaupt per @PrePersist greift und wenn nicht, dann ggf, das @Transient entfernen und einen anderen weg finden...
    @Transient
    private boolean markedAsDeleted = false;

    public boolean isDeleted() {
        return deletedAt != null;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

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
        return "AbstractRevisionDatesDeleteMarkerEntity [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
    }

}
