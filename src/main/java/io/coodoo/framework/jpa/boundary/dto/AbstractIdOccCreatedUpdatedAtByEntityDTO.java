package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedAtByEntity;
import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedUpdatedAtByEntity} and {@link AbstractIdOccCreatedUpdatedDeletedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedUpdatedAtByEntityDTO extends AbstractCreatedUpdatedAtByEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedUpdatedAtByEntityDTO() {}

    public AbstractIdOccCreatedUpdatedAtByEntityDTO(AbstractIdOccCreatedUpdatedAtByEntity abstractIdOccCreatedUpdatedAtByEntity) {
        super(abstractIdOccCreatedUpdatedAtByEntity);
        this.id = abstractIdOccCreatedUpdatedAtByEntity.getId();
        this.version = abstractIdOccCreatedUpdatedAtByEntity.getVersion();
    }

    public AbstractIdOccCreatedUpdatedAtByEntityDTO(AbstractIdOccCreatedUpdatedDeletedAtByEntity abstractIdOccCreatedUpdatedDeletedAtByEntity) {
        super(abstractIdOccCreatedUpdatedDeletedAtByEntity);
        this.id = abstractIdOccCreatedUpdatedDeletedAtByEntity.getId();
        this.version = abstractIdOccCreatedUpdatedDeletedAtByEntity.getVersion();
    }

}
