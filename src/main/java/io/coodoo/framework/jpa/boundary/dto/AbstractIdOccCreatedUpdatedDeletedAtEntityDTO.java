package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractIdOccCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractIdOccCreatedUpdatedDeletedAtEntity} <br>
 * <strong>To hide the <code>deletedAt</code> field use {@link AbstractIdOccCreatedUpdatedAtEntityDTO}</strong>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractIdOccCreatedUpdatedDeletedAtEntityDTO extends AbstractCreatedUpdatedDeletedAtEntityDTO {

    public Long id;

    public Integer version = 0;

    public AbstractIdOccCreatedUpdatedDeletedAtEntityDTO() {}

    public AbstractIdOccCreatedUpdatedDeletedAtEntityDTO(AbstractIdOccCreatedUpdatedDeletedAtEntity abstractIdOccCreatedUpdatedDeletedAtEntity) {
        super(abstractIdOccCreatedUpdatedDeletedAtEntity);
        this.id = abstractIdOccCreatedUpdatedDeletedAtEntity.getId();
        this.version = abstractIdOccCreatedUpdatedDeletedAtEntity.getVersion();
    }

}
