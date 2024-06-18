package com.java.features.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        httpClientCall();
    }

    private static void httpClientCall() throws IOException, InterruptedException {
        java.net.http.HttpClient client =
                java.net.http.HttpClient.newBuilder()
                        .connectTimeout(Duration.ofMinutes(10))
                        .build();

        HttpRequest request =
                HttpRequest.newBuilder(URI.create("https://httpbin.org/get"))
                        .header("User-Agent", "Java 11 HttpClient Bot")
                        .GET()
                        .build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            log.info("response {}", response.body());
        }
    }
}
