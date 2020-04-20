package io.coodoo.framework.jpa.boundary;

import javax.persistence.PreUpdate;

/**
 * A <b>deletion user</b> is provided for the entity that corresponds to the database column <code>deleted_by</code>.<br>
 * <i>The user ID (if provided by an implementation of {@link RevisionUser}) is set to mark this entity as deleted ({@link PreUpdate} callback). You can mark it
 * by calling {@link #markAsDeleted()}</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface DeletedBy {

    public Long getDeletedBy();

    public void setDeletedBy(Long deletedBy);

}
