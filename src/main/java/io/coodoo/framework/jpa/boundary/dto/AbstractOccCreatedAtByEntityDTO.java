package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedAtByEntityDTO extends AbstractCreatedAtByEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedAtByEntityDTO() {}

    public AbstractOccCreatedAtByEntityDTO(AbstractOccCreatedAtByEntity abstractOccCreatedAtByEntity) {
        super(abstractOccCreatedAtByEntity);
        this.version = abstractOccCreatedAtByEntity.getVersion();
    }

}
