package com.alexander.examensarbete.model;

import com.alexander.examensarbete.registration.token.ConfirmationToken;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Data
public class User implements UserDetails {
    @Id
    private String id;

    private String username;
    private String password;
    private String email;
    private ArrayList<Recipe> recipes;
    private ConfirmationToken token;
    private UserRole userRole;
    private boolean locked;
    private boolean enabled;

    public User() {
    }

    public User(String username, String password, String email, ArrayList<Recipe> recipes, UserRole userRole, boolean locked, boolean enabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.recipes = recipes;
        this.userRole = userRole;
        this.locked = locked;
        this.enabled = enabled;
    }

    public User(String username, String password, String email, UserRole userRole) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.userRole = userRole;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
