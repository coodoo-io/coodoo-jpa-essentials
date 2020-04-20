package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedAtEntity;
import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedUpdatedAtEntity} and {@link AbstractCreatedUpdatedDeletedAtEntity}
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

    public AbstractCreatedUpdatedAtEntityDTO(AbstractCreatedUpdatedDeletedAtEntity abstractCreatedUpdatedDeletedAtEntity) {
        super(abstractCreatedUpdatedDeletedAtEntity);
        this.updatedAt = abstractCreatedUpdatedDeletedAtEntity.getUpdatedAt();
    }

}
