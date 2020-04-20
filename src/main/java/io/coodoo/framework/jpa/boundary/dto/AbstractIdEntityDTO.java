package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdEntityDTO {

    public Long id;

    public AbstractIdEntityDTO() {}

    public AbstractIdEntityDTO(AbstractIdEntity abstractIdEntity) {
        this.id = abstractIdEntity.getId();
    }

}
