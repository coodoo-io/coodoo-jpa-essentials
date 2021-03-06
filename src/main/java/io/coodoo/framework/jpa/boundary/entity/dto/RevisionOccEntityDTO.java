package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdOccCreatedUpdatedAtByEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.RevisionOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedAtByEntityDTO}
 */
@Deprecated
public class RevisionOccEntityDTO extends RevisionEntityDTO {

    public Integer version;

    public RevisionOccEntityDTO() {}

    public RevisionOccEntityDTO(RevisionOccEntity revisionOccEntity) {
        super(revisionOccEntity);
        this.version = revisionOccEntity.getVersion();
    }

}
