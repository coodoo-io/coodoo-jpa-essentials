package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdOccCreatedUpdatedDeletedAtEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.RevisionDatesDmOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link RevisionDatesDmOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccCreatedUpdatedDeletedAtEntityDTO}
 */
@Deprecated
public class RevisionDatesDmOccEntityDTO extends RevisionDatesDmEntityDTO {

    public Integer version;

    public RevisionDatesDmOccEntityDTO() {}

    public RevisionDatesDmOccEntityDTO(RevisionDatesDmOccEntity revisionDatesDmOccEntity) {
        super(revisionDatesDmOccEntity);
        this.version = revisionDatesDmOccEntity.getVersion();
    }

}
