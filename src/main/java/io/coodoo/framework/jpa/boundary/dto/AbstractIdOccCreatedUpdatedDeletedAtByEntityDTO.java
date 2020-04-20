package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedUpdatedDeletedAtByEntity} <br>
 * <strong>To hide the <code>deletedAt</code> and <code>deletedBy</code> field use {@link AbstractIdOccCreatedUpdatedAtByEntityDTO}</strong>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedUpdatedDeletedAtByEntityDTO extends AbstractCreatedUpdatedDeletedAtByEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedUpdatedDeletedAtByEntityDTO() {}

    public AbstractIdOccCreatedUpdatedDeletedAtByEntityDTO(AbstractIdOccCreatedUpdatedDeletedAtByEntity abstractIdOccCreatedUpdatedDeletedAtByEntity) {
        super(abstractIdOccCreatedUpdatedDeletedAtByEntity);
        this.id = abstractIdOccCreatedUpdatedDeletedAtByEntity.getId();
        this.version = abstractIdOccCreatedUpdatedDeletedAtByEntity.getVersion();
    }

}
