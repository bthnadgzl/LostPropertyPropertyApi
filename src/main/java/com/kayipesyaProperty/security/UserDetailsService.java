package com.kayipesyaProperty.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static com.kayipesyaProperty.constant.UserRole.ROLE_CLIENT;

@Service
@AllArgsConstructor

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            return org.springframework.security.core.userdetails.User
                    .withUsername(email)
                    .password("")
                    .authorities(ROLE_CLIENT)
                    .accountExpired(false)
                    .accountLocked(false)
                    .credentialsExpired(false)
                    .disabled(false)
                    .build();
    }

}
