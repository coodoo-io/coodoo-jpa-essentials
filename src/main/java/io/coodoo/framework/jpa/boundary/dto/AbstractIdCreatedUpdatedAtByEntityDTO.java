package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedAtByEntity}
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

}
