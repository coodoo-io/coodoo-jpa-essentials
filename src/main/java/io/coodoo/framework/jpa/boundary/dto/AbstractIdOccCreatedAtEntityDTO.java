package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedAtEntityDTO extends AbstractCreatedAtEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedAtEntityDTO() {}

    public AbstractIdOccCreatedAtEntityDTO(AbstractIdOccCreatedAtEntity abstractIdOccCreatedAtEntity) {
        super(abstractIdOccCreatedAtEntity);
        this.id = abstractIdOccCreatedAtEntity.getId();
        this.version = abstractIdOccCreatedAtEntity.getVersion();
    }

}
