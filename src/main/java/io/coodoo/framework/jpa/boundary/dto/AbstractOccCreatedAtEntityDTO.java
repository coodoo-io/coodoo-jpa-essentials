package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedAtEntityDTO extends AbstractCreatedAtEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedAtEntityDTO() {}

    public AbstractOccCreatedAtEntityDTO(AbstractOccCreatedAtEntity abstractOccCreatedAtEntity) {
        super(abstractOccCreatedAtEntity);
        this.version = abstractOccCreatedAtEntity.getVersion();
    }

}
