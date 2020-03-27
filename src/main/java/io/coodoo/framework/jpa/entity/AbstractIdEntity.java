package io.coodoo.framework.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.coodoo.framework.jpa.boundary.IdAnnotated;

/**
 * This {@link MappedSuperclass} is {@link Serializable}<br>
 * <br>
 * 
 * <table border="1" summary="Fields">
 * <tbody>
 * <tr>
 * <th></th>
 * <th>Field</th>
 * <th>Type</th>
 * <th>Column</th>
 * <th>Info</th>
 * </tr>
 * <tr>
 * <td><b>ID</b></td>
 * <td>{@link #id}</td>
 * <td>{@link Long}</td>
 * <td><code>id</code></td>
 * <td>This {@link Id} annotated field uses the {@link GeneratedValue} strategy {@link GenerationType#IDENTITY}. It comes with {@link #hashCode()} and
 * {@link #equals(Object)} methods based on the {@link #id} field</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractIdEntity implements IdAnnotated, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractIdEntity [id=");
        builder.append(id);
        builder.append("]");
        return builder.toString();
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
        if (obj == null || !(obj instanceof AbstractIdEntity)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (((AbstractIdEntity) obj).getId() == null) {
            return false;
        }
        return ((AbstractIdEntity) obj).getId().equals(getId());
    }

}
