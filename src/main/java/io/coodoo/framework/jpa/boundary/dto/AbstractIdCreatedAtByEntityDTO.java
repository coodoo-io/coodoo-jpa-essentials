package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedAtByEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedAtByEntityDTO extends AbstractCreatedAtByEntityDTO {

    public Long id;

    public AbstractIdCreatedAtByEntityDTO() {}

    public AbstractIdCreatedAtByEntityDTO(AbstractIdCreatedAtByEntity abstractIdCreatedAtByEntity) {
        super(abstractIdCreatedAtByEntity);
        this.id = abstractIdCreatedAtByEntity.getId();
    }

}
