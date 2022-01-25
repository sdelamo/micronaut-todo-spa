package com.objectcomputing.todo.controller;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import javax.validation.constraints.NotBlank;

@Serdeable
public class TodoForm {

    @NonNull
    @NotBlank
    private final String action;

    public TodoForm(@NonNull String action) {
        this.action = action;
    }

    @NonNull
    public String getAction() {
        return action;
    }
}
