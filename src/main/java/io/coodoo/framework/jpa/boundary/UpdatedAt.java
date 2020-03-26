package io.coodoo.framework.jpa.boundary;

import java.time.LocalDateTime;

import javax.persistence.PreUpdate;

/**
 * A <b>update date</b> is provided for the entity that corresponds to the database column <code>updated_at</code>.<br>
 * <i>The current time is set the moment this entity is updated ({@link PreUpdate} callback)</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface UpdatedAt {

    public LocalDateTime getUpdatedAt();

    public void setUpdatedAt(LocalDateTime updatedAt);

}
