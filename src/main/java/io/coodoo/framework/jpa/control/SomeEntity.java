package io.coodoo.framework.jpa.control;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionDatesEntity;

@Entity
public class SomeEntity extends AbstractRevisionDatesEntity {

    @Column
    private String something;

    @Column
    private int amount;

    // ...
}
