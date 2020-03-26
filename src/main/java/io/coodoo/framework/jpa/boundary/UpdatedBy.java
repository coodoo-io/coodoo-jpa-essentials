package io.coodoo.framework.jpa.boundary;

import javax.persistence.PreUpdate;

/**
 * A <b>update user</b> is provided for the entity that corresponds to the database column <code>updated_by</code>.<br>
 * <i>The user ID (if provided by an implementation of {@link RevisionUser}) is set the moment this entity is updated ({@link PreUpdate} callback)</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface UpdatedBy {

    public Long getUpdatedBy();

    public void setUpdatedBy(Long updatedBy);

}
