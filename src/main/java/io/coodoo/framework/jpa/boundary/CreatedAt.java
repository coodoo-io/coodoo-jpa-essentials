package io.coodoo.framework.jpa.boundary;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;

/**
 * A <b>creation date</b> is provided for the entity that corresponds to the database column <code>created_at</code>.<br>
 * <i>The current time is set the moment this entity is persisted ({@link PrePersist} callback)</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface CreatedAt {

    public LocalDateTime getCreatedAt();

    public void setCreatedAt(LocalDateTime createdAt);

}
