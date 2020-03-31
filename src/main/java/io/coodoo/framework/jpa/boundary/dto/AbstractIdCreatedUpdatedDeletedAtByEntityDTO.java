package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdCreatedUpdatedDeletedAtByEntity} <br>
 * <strong>To hide the <code>deletedAt</code> and <code>deletedBy</code> field use {@link AbstractIdCreatedUpdatedAtByEntityDTO}</strong>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdCreatedUpdatedDeletedAtByEntityDTO extends AbstractCreatedUpdatedDeletedAtByEntityDTO {

    public Long id;

    public AbstractIdCreatedUpdatedDeletedAtByEntityDTO() {}

    public AbstractIdCreatedUpdatedDeletedAtByEntityDTO(AbstractIdCreatedUpdatedDeletedAtByEntity abstractIdCreatedUpdatedDeletedAtByEntity) {
        super(abstractIdCreatedUpdatedDeletedAtByEntity);
        this.id = abstractIdCreatedUpdatedDeletedAtByEntity.getId();
    }

}
