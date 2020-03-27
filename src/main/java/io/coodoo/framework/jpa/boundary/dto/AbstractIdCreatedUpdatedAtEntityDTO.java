package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedUpdatedAtEntityDTO extends AbstractCreatedUpdatedAtEntityDTO {

    public Long id;

    public AbstractIdCreatedUpdatedAtEntityDTO() {}

    public AbstractIdCreatedUpdatedAtEntityDTO(AbstractIdCreatedUpdatedAtEntity abstractIdCreatedUpdatedAtEntity) {
        super(abstractIdCreatedUpdatedAtEntity);
        this.id = abstractIdCreatedUpdatedAtEntity.getId();
    }

}
