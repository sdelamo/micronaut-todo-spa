package com.objectcomputing.todo.persistence.data;

import com.objectcomputing.todo.controller.Todo;
import com.objectcomputing.todo.persistence.TodoRepository;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.GenericRepository;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface TodoJdbcRepository extends TodoRepository<TodoEntity>, GenericRepository<TodoEntity, UUID> {
    @Override
    @NonNull
    TodoEntity save(@NonNull @NotBlank String action, @NonNull @NotBlank String principal);

    @Override
    @NonNull
    List<Todo> findByPrincipal(@NonNull @NotBlank String name);
}
