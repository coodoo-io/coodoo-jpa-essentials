package io.coodoo.framework.jpa.boundary;

import javax.persistence.Version;

/**
 * A <b>OCC</b> is provided for the entity that corresponds to the database column <code>version</code>.<br>
 * <i>Optimistic concurrency control (OCC) is provided by {@link Version}</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface VersionAnnotated {

    public Integer getVersion();

    public void setVersion(Integer version);

}
