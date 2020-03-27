package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedUpdatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedUpdatedAtByEntityDTO extends AbstractCreatedAtByEntityDTO {

    public LocalDateTime updatedAt;

    public Long updatedBy;

    public AbstractCreatedUpdatedAtByEntityDTO() {}

    public AbstractCreatedUpdatedAtByEntityDTO(AbstractCreatedUpdatedAtByEntity abstractCreatedUpdatedAtByEntity) {
        super(abstractCreatedUpdatedAtByEntity);
        this.updatedAt = abstractCreatedUpdatedAtByEntity.getUpdatedAt();
        this.updatedBy = abstractCreatedUpdatedAtByEntity.getUpdatedBy();
    }

}
