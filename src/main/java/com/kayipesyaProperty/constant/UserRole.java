package com.kayipesyaProperty.constant;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority(){
        return name();
    }
}
