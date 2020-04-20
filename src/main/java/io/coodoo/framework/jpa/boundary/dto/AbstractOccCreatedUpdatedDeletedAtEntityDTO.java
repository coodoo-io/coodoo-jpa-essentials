package io.coodoo.framework.jpa.boundary.dto;

import io.coodoo.framework.jpa.entity.AbstractOccCreatedUpdatedDeletedAtEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractOccCreatedUpdatedDeletedAtEntity} <br>
 * <strong>To hide the <code>deletedAt</code> field use {@link AbstractOccCreatedUpdatedAtEntityDTO}</strong>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractOccCreatedUpdatedDeletedAtEntityDTO extends AbstractCreatedUpdatedDeletedAtEntityDTO {

    public Integer version = 0;

    public AbstractOccCreatedUpdatedDeletedAtEntityDTO() {}

    public AbstractOccCreatedUpdatedDeletedAtEntityDTO(AbstractOccCreatedUpdatedDeletedAtEntity abstractOccCreatedUpdatedDeletedAtEntity) {
        super(abstractOccCreatedUpdatedDeletedAtEntity);
        this.version = abstractOccCreatedUpdatedDeletedAtEntity.getVersion();
    }

}
