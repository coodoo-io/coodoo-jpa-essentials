package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdCreatedUpdatedAtByEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.RevisionEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdCreatedUpdatedAtByEntityDTO}
 */
@Deprecated
public class RevisionEntityDTO extends RevisionDatesEntityDTO {

    public Long createdBy;
    public Long updatedBy;

    public RevisionEntityDTO() {}

    public RevisionEntityDTO(RevisionEntity revisionEntity) {
        super(revisionEntity);
        this.createdBy = revisionEntity.getCreatedBy();
        this.updatedBy = revisionEntity.getUpdatedBy();
    }

}
