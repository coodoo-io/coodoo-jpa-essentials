package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccEntityDTO() {}

    public AbstractIdOccEntityDTO(AbstractIdOccEntity abstractIdOccEntity) {
        super();
        this.id = abstractIdOccEntity.getId();
        this.version = abstractIdOccEntity.getVersion();
    }

}
