package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractCreatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedAtByEntityDTO extends AbstractCreatedAtEntityDTO {

    public Long createdBy;

    public AbstractCreatedAtByEntityDTO() {}

    public AbstractCreatedAtByEntityDTO(AbstractCreatedAtByEntity abstractCreatedAtByEntity) {
        super(abstractCreatedAtByEntity);
        this.createdBy = abstractCreatedAtByEntity.getCreatedBy();
    }

}
