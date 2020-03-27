package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedUpdatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedUpdatedAtByEntityDTO extends AbstractCreatedUpdatedAtByEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedUpdatedAtByEntityDTO() {}

    public AbstractOccCreatedUpdatedAtByEntityDTO(AbstractOccCreatedUpdatedAtByEntity abstractOccCreatedUpdatedAtByEntity) {
        super(abstractOccCreatedUpdatedAtByEntity);
        this.version = abstractOccCreatedUpdatedAtByEntity.getVersion();
    }

}
