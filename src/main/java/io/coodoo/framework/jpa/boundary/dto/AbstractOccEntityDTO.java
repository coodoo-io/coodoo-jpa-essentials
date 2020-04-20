package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccEntityDTO {

    public Integer version = 0;

    public AbstractOccEntityDTO() {}

    public AbstractOccEntityDTO(AbstractOccEntity abstractOccEntity) {
        this.version = abstractOccEntity.getVersion();
    }

}
