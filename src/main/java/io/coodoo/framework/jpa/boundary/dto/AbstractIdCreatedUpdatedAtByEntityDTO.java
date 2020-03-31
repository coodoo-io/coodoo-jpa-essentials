package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedAtByEntity;
import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedAtByEntity} and {@link AbstractIdCreatedUpdatedDeletedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedUpdatedAtByEntityDTO extends AbstractCreatedUpdatedAtByEntityDTO {

    public Long id;

    public AbstractIdCreatedUpdatedAtByEntityDTO() {}

    public AbstractIdCreatedUpdatedAtByEntityDTO(AbstractIdCreatedUpdatedAtByEntity abstractIdCreatedUpdatedAtByEntity) {
        super(abstractIdCreatedUpdatedAtByEntity);
        this.id = abstractIdCreatedUpdatedAtByEntity.getId();
    }

    public AbstractIdCreatedUpdatedAtByEntityDTO(AbstractIdCreatedUpdatedDeletedAtByEntity abstractIdCreatedUpdatedDeletedAtByEntity) {
        super(abstractIdCreatedUpdatedDeletedAtByEntity);
        this.id = abstractIdCreatedUpdatedDeletedAtByEntity.getId();
    }

}
