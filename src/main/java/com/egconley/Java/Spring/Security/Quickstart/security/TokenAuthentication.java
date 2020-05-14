package com.egconley.Java.Spring.Security.Quickstart.security;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class TokenAuthentication implements Authentication {

    private final DecodedJWT jwt;
    private boolean invalidated;

    public TokenAuthentication(DecodedJWT jwt) {
        // No authorities by default for this login example. You can use the DecodedJWT to create authorities from
        // claims as needed for your particular use case.
        super();
        this.jwt = jwt;
    }

    private boolean hasExpired() {
        return jwt.getExpiresAt().before(new Date());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getCredentials() {
        return jwt.getToken();
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return jwt.getSubject();
    }

    @Override
    public void setAuthenticated(boolean authenticated) {
        if (authenticated) {
            throw new IllegalArgumentException("Create a new Authentication object to authenticate");
        }
        invalidated = true;
    }

    @Override
    public boolean isAuthenticated() {
        return !invalidated && !hasExpired();
    }

    /**
     * Gets the claims for this JWT token.
     * <br>
     * For an ID token, claims represent user profile information such as the user's name, profile, picture, etc.
     * <br>
     * @see <a href="https://auth0.com/docs/tokens/id-token">ID Token Documentation</a>
     * @return a Map containing the claims of the token.
     */
    public Map<String, Claim> getClaims() {
        return jwt.getClaims();
    }


    @Override
    public String getName() {
        return null;
    }
}
