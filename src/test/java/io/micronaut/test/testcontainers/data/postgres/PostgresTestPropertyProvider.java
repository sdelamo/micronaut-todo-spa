package io.micronaut.test.testcontainers.data.postgres;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.test.testcontainers.data.SharedDatabaseContainerTestPropertyProvider;
import org.testcontainers.containers.JdbcDatabaseContainer;

public interface PostgresTestPropertyProvider extends SharedDatabaseContainerTestPropertyProvider {

    @Override
    default Dialect dialect() {
        return Dialect.POSTGRES;
    }

    @Override
    default void startContainer(JdbcDatabaseContainer container) {
        container.start();
    }
}

