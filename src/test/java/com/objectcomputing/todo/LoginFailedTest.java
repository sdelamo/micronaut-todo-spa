package com.objectcomputing.todo;

import com.objectcomputing.todo.security.AuthenticationExceptionHandlerReplacement;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
public class LoginFailedTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void loginFailedServesHTMLPageTellingTheUserTheLoginFailed() {
        BlockingHttpClient client = httpClient.toBlocking();
        HttpRequest<?> request = HttpRequest.GET(AuthenticationExceptionHandlerReplacement.LOGIN_FAILED);
        String html = client.retrieve(request);
        assertTrue(html.contains("Login Failed"));
    }
}
