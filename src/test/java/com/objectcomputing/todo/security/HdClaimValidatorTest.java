package com.objectcomputing.todo.security;

import com.objectcomputing.todo.utils.JwtClaimsMapAdapter;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HdClaimValidatorTest {

    @Test
    void validatesHdClaim() {
        HdClaimValidator hdClaimValidator = new HdClaimValidator(() -> "objectcomputing.com");
        assertFalse(hdClaimValidator.validate(new JwtClaimsMapAdapter(Collections.emptyMap()), null));
        assertFalse(hdClaimValidator.validate(new JwtClaimsMapAdapter(Collections.singletonMap("hd", "micronaut.io")), null));
        assertTrue(hdClaimValidator.validate(new JwtClaimsMapAdapter(Collections.singletonMap("hd", "objectcomputing.com")), null));

    }
}