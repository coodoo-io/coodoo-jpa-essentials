package io.coodoo.framework.jpa.boundary.entity.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.boundary.entity.RevisionDmEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDmEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class RevisionDmEntityDTO extends RevisionEntityDTO {

    public LocalDateTime deletedAt;
    public Long deletedBy;

    public RevisionDmEntityDTO() {}

    public RevisionDmEntityDTO(RevisionDmEntity revisionDmEntity) {
        super(revisionDmEntity);
        this.deletedAt = revisionDmEntity.getDeletedAt();
        this.deletedBy = revisionDmEntity.getDeletedBy();
    }

}
