package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedUpdatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedUpdatedAtEntityDTO extends AbstractCreatedUpdatedAtEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedUpdatedAtEntityDTO() {}

    public AbstractOccCreatedUpdatedAtEntityDTO(AbstractOccCreatedUpdatedAtEntity abstractOccCreatedUpdatedAtEntity) {
        super(abstractOccCreatedUpdatedAtEntity);
        this.version = abstractOccCreatedUpdatedAtEntity.getVersion();
    }

}
