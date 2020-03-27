package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedUpdatedDeletedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedUpdatedDeletedAtEntityDTO extends AbstractCreatedUpdatedAtEntityDTO {

    public LocalDateTime deletedAt;

    public AbstractCreatedUpdatedDeletedAtEntityDTO() {}

    public AbstractCreatedUpdatedDeletedAtEntityDTO(AbstractCreatedUpdatedDeletedAtEntity qbstractCreatedUpdatedDeletedAtEntity) {
        super(qbstractCreatedUpdatedDeletedAtEntity);
        this.deletedAt = qbstractCreatedUpdatedDeletedAtEntity.getDeletedAt();
    }

}
