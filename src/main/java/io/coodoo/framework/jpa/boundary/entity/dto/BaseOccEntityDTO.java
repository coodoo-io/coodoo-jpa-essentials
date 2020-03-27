package io.coodoo.framework.jpa.boundary.entity.dto;

import io.coodoo.framework.jpa.boundary.dto.AbstractIdOccEntityDTO;
import io.coodoo.framework.jpa.boundary.entity.BaseOccEntity;

/**
 * Data transfer object (DTO) dedicated to {@link BaseOccEntity}
 * 
 * @author coodoo GmbH (coodoo.io)
 * @deprecated use {@link AbstractIdOccEntityDTO}
 */
@Deprecated
public class BaseOccEntityDTO extends BaseEntityDTO {

    public Integer version;

    public BaseOccEntityDTO() {}

    public BaseOccEntityDTO(BaseOccEntity baseOccEntity) {
        super(baseOccEntity);
        this.version = baseOccEntity.getVersion();
    }

}
