package com.objectcomputing.todo.security;

import io.micronaut.core.annotation.NonNull;

public interface HostedDomain {

    String CLAIM_HD = "hd";

    @NonNull
    String getUrl();
}
