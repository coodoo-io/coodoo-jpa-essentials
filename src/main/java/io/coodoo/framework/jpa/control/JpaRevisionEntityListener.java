package io.coodoo.framework.jpa.control;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.PostPersist;
import javax.persistence.PreUpdate;

import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionDatesEntity;

/**
 * Intercepts JPA events to set revision information
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@Stateless
public class JpaRevisionEntityListener {

    @EJB // @Inject BUG: Inject not possible in EntityListener, FIX available for WildFly 11.0.0.Alpha1, see: https://issues.jboss.org/browse/WFLY-2387
    JpaRevisionService jpaRevisionService;

    @PostPersist
    public void create(AbstractRevisionDatesEntity entity) {

        jpaRevisionService.markCreation(entity);
    }

    @PreUpdate
    public void update(AbstractRevisionDatesEntity entity) {

        jpaRevisionService.markUpdate(entity);
    }

}
