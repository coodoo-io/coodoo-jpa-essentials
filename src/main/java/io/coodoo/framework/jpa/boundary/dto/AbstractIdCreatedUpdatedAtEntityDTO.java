package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedAtEntity;
import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedAtEntity} and {@link AbstractIdCreatedUpdatedDeletedAtEntity}
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

    public AbstractIdCreatedUpdatedAtEntityDTO(AbstractIdCreatedUpdatedDeletedAtEntity abstractIdCreatedUpdatedDeletedAtEntity) {
        super(abstractIdCreatedUpdatedDeletedAtEntity);
        this.id = abstractIdCreatedUpdatedDeletedAtEntity.getId();
    }

}
