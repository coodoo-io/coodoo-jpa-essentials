package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedDeletedAtEntity} <br>
 * <strong>To hide the <code>deletedAt</code> field use {@link AbstractIdCreatedUpdatedAtEntityDTO}</strong>
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
