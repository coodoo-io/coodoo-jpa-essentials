package io.coodoo.framework.jpa.boundary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.coodoo.framework.jpa.boundary.IdAnnotated;
import io.coodoo.framework.jpa.entity.AbstractIdEntity;

/**
 * Base identification entity <br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tr>
 * <th>Fields</th>
 * <th>ID</th>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>id</td>
 * </tr>
 * <tr>
 * <td>Type</td>
 * <td>Long</td>
 * </tr>
 * <tr>
 * <td>Column name</td>
 * <td>id</td>
 * </tr>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdEntity}
 */
@Deprecated
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseEntity implements IdAnnotated, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }

    @Override
    public int hashCode() {
        if (getId() != null) {
            return getId().hashCode();
        } else {
            return super.hashCode();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BaseEntity)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        if (((BaseEntity) obj).getId() == null) {
            return false;
        }
        return ((BaseEntity) obj).getId().equals(getId());
    }

}
