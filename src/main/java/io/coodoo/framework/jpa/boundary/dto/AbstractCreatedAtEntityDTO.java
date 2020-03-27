package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedAtEntityDTO {

    public LocalDateTime createdAt;

    public AbstractCreatedAtEntityDTO() {}

    public AbstractCreatedAtEntityDTO(AbstractCreatedAtEntity abstractCreatedAtEntity) {
        this.createdAt = abstractCreatedAtEntity.getCreatedAt();
    }

}
