package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedAtEntity;
import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedUpdatedAtEntity} and {@link AbstractOccCreatedUpdatedDeletedAtEntity}
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

    public AbstractOccCreatedUpdatedAtEntityDTO(AbstractOccCreatedUpdatedDeletedAtEntity abstractOccCreatedUpdatedDeletedAtEntity) {
        super(abstractOccCreatedUpdatedDeletedAtEntity);
        this.version = abstractOccCreatedUpdatedDeletedAtEntity.getVersion();
    }

}
