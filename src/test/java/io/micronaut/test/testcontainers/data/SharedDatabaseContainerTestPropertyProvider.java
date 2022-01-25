package io.micronaut.test.testcontainers.data;

import org.testcontainers.containers.JdbcDatabaseContainer;

public interface SharedDatabaseContainerTestPropertyProvider extends DatabaseTestPropertyProvider {

    @Override
    default JdbcDatabaseContainer getDatabaseContainer(String driverName) {
        return DbHolder.getContainerOrCreate(driverName, () -> DatabaseTestPropertyProvider.super.getDatabaseContainer(driverName));
    }
}