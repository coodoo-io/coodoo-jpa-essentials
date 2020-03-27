package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdOccCreatedUpdatedAtEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.RevisionDatesOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDatesOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedAtEntityDTO}
 */
@Deprecated
public class RevisionDatesOccEntityDTO extends RevisionDatesEntityDTO {

    public Integer version;

    public RevisionDatesOccEntityDTO() {}

    public RevisionDatesOccEntityDTO(RevisionDatesOccEntity revisionDatesOccEntity) {
        super(revisionDatesOccEntity);
        this.version = revisionDatesOccEntity.getVersion();
    }

}
