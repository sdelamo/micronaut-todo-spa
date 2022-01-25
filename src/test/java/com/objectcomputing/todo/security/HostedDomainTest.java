package com.objectcomputing.todo.security;

import io.micronaut.context.BeanContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest(startApplication = false)
public class HostedDomainTest {

    @Inject
    BeanContext beanContext;

    @Test
    void beanOfTypeHostedDomain() {
        beanContext.containsBean(HostedDomain.class);
    }
}
