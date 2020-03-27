package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedUpdatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedUpdatedAtEntityDTO extends AbstractCreatedUpdatedAtEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedUpdatedAtEntityDTO() {}

    public AbstractIdOccCreatedUpdatedAtEntityDTO(AbstractIdOccCreatedUpdatedAtEntity abstractIdOccCreatedUpdatedAtEntity) {
        super(abstractIdOccCreatedUpdatedAtEntity);
        this.id = abstractIdOccCreatedUpdatedAtEntity.getId();
        this.version = abstractIdOccCreatedUpdatedAtEntity.getVersion();
    }

}
