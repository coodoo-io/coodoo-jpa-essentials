package io.coodoo.framework.jpa.boundary.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Base identification entity with optimistic concurrency control version number
 * 
 * <br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Fields</th>
 * <th>ID</th>
 * <th>OCC</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * <td>version</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * <td>Integer</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * <td>version</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseOccEntity extends BaseEntity {

    @Version
    @Column(name = "version")
    protected Integer version = 0;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AbstractVersionEntity [id=" + id + ", version=" + version + "]";
    }

}
