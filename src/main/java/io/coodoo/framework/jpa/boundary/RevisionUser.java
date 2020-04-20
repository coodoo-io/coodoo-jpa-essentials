package io.coodoo.framework.jpa.boundary;

/**
 * To get the user informations related to a JPA event
 * 
 * <br>
 * <i>This interface has to get implemented in order to be injectable</i>
 * 
 * @author coodoo GmbH (coodoo.io)
 */
public interface RevisionUser {

    /**
     * The technical reference to the user
     * 
     * @return a numerical ID
     */
    public Long getUserId();

}
