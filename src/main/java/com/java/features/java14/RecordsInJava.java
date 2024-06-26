package com.java.features.java14;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecordsInJava {

    private record User(String name, int age) {}

    private record Response(int statusCode, String body) {}

    public static void main(String[] args) {
        Response response = new Response(200, "OK");
        log.info("{} {}", response.statusCode(), response.body());

        User user = new User("Agni", 10);
        log.info("{} - {}", user.name(), user.age());
    }
}
