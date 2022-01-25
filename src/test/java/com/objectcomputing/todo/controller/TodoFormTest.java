package com.objectcomputing.todo.controller;

import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.type.Argument;
import io.micronaut.serde.SerdeIntrospections;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@MicronautTest(startApplication = false)
public class TodoFormTest {
    @Inject
    SerdeIntrospections serdeIntrospections;

    @Test
    void classTodoFormIsAnnotatedWithAtIntrospected() {
        Executable e = () -> BeanIntrospection.getIntrospection(TodoForm.class);
        assertDoesNotThrow(e);
    }

    @Test
    void classTodoFormIsSerializable() {
        Executable e = () -> serdeIntrospections.getSerializableIntrospection(Argument.of(TodoForm.class));
        assertDoesNotThrow(e);
    }
}
