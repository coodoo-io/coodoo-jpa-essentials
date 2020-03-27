package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedDeletedAtEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedUpdatedDeletedAtEntityDTO extends AbstractCreatedUpdatedDeletedAtEntityDTO {

    public Long id;

    public AbstractIdCreatedUpdatedDeletedAtEntityDTO() {}

    public AbstractIdCreatedUpdatedDeletedAtEntityDTO(AbstractIdCreatedUpdatedDeletedAtEntity abstractIdCreatedUpdatedDeletedAtEntity) {
        super(abstractIdCreatedUpdatedDeletedAtEntity);
        this.id = abstractIdCreatedUpdatedDeletedAtEntity.getId();
    }

}
