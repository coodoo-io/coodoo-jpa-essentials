package io.coodoo.framework.jpa.boundary.entity.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.boundary.entity.RevisionDatesDmEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDatesDmEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class RevisionDatesDmEntityDTO extends RevisionDatesEntityDTO {

    public LocalDateTime deletedAt;

    public RevisionDatesDmEntityDTO() {}

    public RevisionDatesDmEntityDTO(RevisionDatesDmEntity revisionDatesDmEntity) {
        super(revisionDatesDmEntity);
        this.deletedAt = revisionDatesDmEntity.getDeletedAt();
    }

}
