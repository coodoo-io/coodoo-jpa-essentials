package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedAtEntityDTO extends AbstractCreatedAtEntityDTO {

    public Long id;

    public AbstractIdCreatedAtEntityDTO() {}

    public AbstractIdCreatedAtEntityDTO(AbstractIdCreatedAtEntity abstractIdCreatedAtEntity) {
        super(abstractIdCreatedAtEntity);
        this.id = abstractIdCreatedAtEntity.getId();
    }

}
