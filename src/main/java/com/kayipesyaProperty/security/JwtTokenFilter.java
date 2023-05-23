package com.kayipesyaProperty.security;

import com.kayipesyaProperty.exception.CustomException;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


@Component
@AllArgsConstructor
public class JwtTokenFilter extends OncePerRequestFilter {
    private final TokenManager tokenManager;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = tokenManager.resolveToken(request);
        try {
            if(token != null && tokenManager.tokenValidate(token)){
                Authentication aut = tokenManager.getAuthentication(token);
                SecurityContextHolder.getContext().setAuthentication(aut);
            }
        }
        catch (CustomException e){
            SecurityContextHolder.clearContext();
            response.sendError(e.getHttpStatus().value(),e.getMessage());
            return;
        }
        filterChain.doFilter(request,response);
    }

}
