package io.coodoo.framework.jpa.boundary;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A <b>ID</b> is provided for the entity that corresponds to the database column <code>id</code>.<br>
 * <i>This {@link Id} annotated field uses the {@link GeneratedValue} strategy {@link GenerationType#IDENTITY}.</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface IdAnnotated {

    public Long getId();

    public void setId(Long id);

}
