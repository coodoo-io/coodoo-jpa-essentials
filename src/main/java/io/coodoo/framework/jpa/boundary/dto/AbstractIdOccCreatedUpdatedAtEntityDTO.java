package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedAtEntity;
import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedUpdatedAtEntity} and {@link AbstractIdOccCreatedUpdatedDeletedAtEntity}
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

    public AbstractIdOccCreatedUpdatedAtEntityDTO(AbstractIdOccCreatedUpdatedDeletedAtEntity abstractIdOccCreatedUpdatedDeletedAtEntity) {
        super(abstractIdOccCreatedUpdatedDeletedAtEntity);
        this.id = abstractIdOccCreatedUpdatedDeletedAtEntity.getId();
        this.version = abstractIdOccCreatedUpdatedDeletedAtEntity.getVersion();
    }

}
