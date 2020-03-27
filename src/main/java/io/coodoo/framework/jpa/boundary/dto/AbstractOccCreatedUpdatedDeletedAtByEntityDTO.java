package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedUpdatedDeletedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedUpdatedDeletedAtByEntityDTO extends AbstractCreatedUpdatedDeletedAtByEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedUpdatedDeletedAtByEntityDTO() {}

    public AbstractOccCreatedUpdatedDeletedAtByEntityDTO(AbstractOccCreatedUpdatedDeletedAtByEntity abstractOccCreatedUpdatedDeletedAtByEntity) {
        super(abstractOccCreatedUpdatedDeletedAtByEntity);
        this.version = abstractOccCreatedUpdatedDeletedAtByEntity.getVersion();
    }

}
