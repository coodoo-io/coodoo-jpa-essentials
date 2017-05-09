package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.entity.BaseEntity;

/**
 * Data transfer object (DTO) dedicated to {@link BaseEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public class BaseEntityDTO {

    public Long id;

    public BaseEntityDTO() {}

    public BaseEntityDTO(BaseEntity baseEntity) {
        super();
        this.id = baseEntity.getId();
    }

}
