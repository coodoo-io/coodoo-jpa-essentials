package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdOccCreatedUpdatedDeletedAtByEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.RevisionDmOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDmOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedDeletedAtByEntityDTO}
 */
@Deprecated
public class RevisionDmOccEntityDTO extends RevisionDmEntityDTO {

    public Integer version;

    public RevisionDmOccEntityDTO() {}

    public RevisionDmOccEntityDTO(RevisionDmOccEntity revisionDmOccEntity) {
        super(revisionDmOccEntity);
        this.version = revisionDmOccEntity.getVersion();
    }

}
