package com.secusociale.portail.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    
    public static final String EMPLOYEUR = "ROLE_EMPLOYEUR";
    
    public static final String SALARIE = "ROLE_SALARIE";
    
    public static final String ALLOCATAIRE = "ROLE_ALLOCATAIRE";

    private AuthoritiesConstants() {
    }
}
