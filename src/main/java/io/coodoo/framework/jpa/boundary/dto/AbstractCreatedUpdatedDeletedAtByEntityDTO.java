package io.coodoo.framework.jpa.boundary.dto;

import java.time.LocalDateTime;

import io.coodoo.framework.jpa.entity.AbstractCreatedUpdatedDeletedAtByEntity;

/**
 * Data transfer object (DTO) dedicated to {@link AbstractCreatedUpdatedDeletedAtByEntity} <br>
 * <strong>To hide the <code>deletedAt</code> and <code>deletedBy</code> field use {@link AbstractCreatedUpdatedAtByEntityDTO}</strong>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class AbstractCreatedUpdatedDeletedAtByEntityDTO extends AbstractCreatedUpdatedAtByEntityDTO {

    public LocalDateTime deletedAt;

    public Long deletedBy;

    public AbstractCreatedUpdatedDeletedAtByEntityDTO() {}

    public AbstractCreatedUpdatedDeletedAtByEntityDTO(AbstractCreatedUpdatedDeletedAtByEntity abstractCreatedUpdatedDeletedAtByEntity) {
        super(abstractCreatedUpdatedDeletedAtByEntity);
        this.deletedAt = abstractCreatedUpdatedDeletedAtByEntity.getDeletedAt();
        this.deletedBy = abstractCreatedUpdatedDeletedAtByEntity.getDeletedBy();
    }

}
