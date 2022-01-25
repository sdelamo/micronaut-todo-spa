package com.objectcomputing.todo.utils;

import io.micronaut.security.token.Claims;
import io.micronaut.security.token.MapClaims;
import io.micronaut.security.token.jwt.generator.claims.JwtClaims;

import java.util.Map;
import java.util.Set;

public class JwtClaimsMapAdapter implements JwtClaims {
    private final Claims delegate;
    public JwtClaimsMapAdapter(Map<String, Object> m) {
        delegate = new MapClaims(m);

    }
    @Override
    public Object get(String name) {
        return delegate.get(name);
    }

    @Override
    public Set<String> names() {
        return delegate.names();
    }

    @Override
    public boolean contains(String name) {
        return delegate.contains(name);
    }
}
