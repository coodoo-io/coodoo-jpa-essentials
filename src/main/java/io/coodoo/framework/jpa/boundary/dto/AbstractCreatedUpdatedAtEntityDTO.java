package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedUpdatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedUpdatedAtEntityDTO extends AbstractCreatedAtEntityDTO {

    public LocalDateTime updatedAt;

    public AbstractCreatedUpdatedAtEntityDTO() {}

    public AbstractCreatedUpdatedAtEntityDTO(AbstractCreatedUpdatedAtEntity abstractCreatedUpdatedAtEntity) {
        super(abstractCreatedUpdatedAtEntity);
        this.updatedAt = abstractCreatedUpdatedAtEntity.getUpdatedAt();
    }

}
