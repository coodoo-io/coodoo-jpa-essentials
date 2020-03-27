package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedAtByEntityDTO extends AbstractCreatedAtByEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedAtByEntityDTO() {}

    public AbstractIdOccCreatedAtByEntityDTO(AbstractIdOccCreatedAtByEntity abstractIdOccCreatedAtByEntity) {
        super(abstractIdOccCreatedAtByEntity);
        this.id = abstractIdOccCreatedAtByEntity.getId();
        this.version = abstractIdOccCreatedAtByEntity.getVersion();
    }

}
