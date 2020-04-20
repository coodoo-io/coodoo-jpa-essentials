package io.coodoo.framework.jpa.boundary;

import javax.persistence.PrePersist;

/**
 * A <b>creation user</b> is provided for the entity that corresponds to the database column <code>created_by</code>.<br>
 * <i>The user ID (if provided by an implementation of {@link RevisionUser}) is set the moment this entity is persisted ({@link PrePersist} callback)</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface CreatedBy {

    public Long getCreatedBy();

    public void setCreatedBy(Long createdBy);

}
