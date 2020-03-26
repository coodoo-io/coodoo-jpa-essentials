package io.coodoo.framework.jpa.boundary;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PreUpdate;

/**
 * A <b>deletion date</b> is provided for the entity that corresponds to the database column <code>deleted_at</code>.<br>
 * <i>The current time is set to mark this entity as deleted ({@link PreUpdate} callback). You can mark it by calling {@link #markAsDeleted()}</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface DeletedAt {

    public LocalDateTime getDeletedAt();

    public void setDeletedAt(LocalDateTime deletedAt);

    /**
     * To just mark an entity as deleted, call this method instead of {@link EntityManager#remove(Object)}. The field {@link #deletedAt} will be set to mark the
     * deletion. <br>
     * On the other hand you have to provide your queries with something like '<code>deleted_at IS NULL</code>' to avoid 'marked as deleted' entries! for those
     * fields if <code>null</code>.
     */
    public void markAsDeleted();

    /**
     * @return <code>true</code> if this entity pretends to be deleted. If <code>false</code> you can doom it by calling {@link #markAsDeleted()}. <br>
     *         You can check {@link #deletedAt} for when it was marked as deleted.
     */
    public boolean isMarkedAsDeleted();

}
