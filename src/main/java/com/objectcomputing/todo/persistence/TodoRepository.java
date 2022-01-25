package com.objectcomputing.todo.persistence;

import com.objectcomputing.todo.controller.Todo;
import io.micronaut.core.annotation.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.security.Principal;
import java.util.List;

public interface TodoRepository<T> {
    @NonNull
    T save(@NonNull @NotBlank String action, @NonNull @NotBlank String principal);


    @NonNull
    default T save(@NonNull @NotBlank String action, @NonNull @NotNull Principal principal) {
        return save(action, principal.getName());
    }

    @NonNull
    List<Todo> findByPrincipal(@NonNull @NotBlank String name);
}
