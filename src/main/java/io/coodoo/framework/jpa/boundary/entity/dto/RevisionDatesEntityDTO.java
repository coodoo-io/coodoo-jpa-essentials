package io.coodoo.framework.jpa.boundary.entity.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.boundary.entity.RevisionDatesEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDatesEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class RevisionDatesEntityDTO extends BaseEntityDTO {

    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

    public RevisionDatesEntityDTO() {}

    public RevisionDatesEntityDTO(RevisionDatesEntity revisionDatesEntity) {
        super(revisionDatesEntity);
        this.createdAt = revisionDatesEntity.getCreatedAt();
        this.updatedAt = revisionDatesEntity.getUpdatedAt();
    }

}
