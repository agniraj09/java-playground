package com.java.features.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileAPINewMethods {

    private static final String CONTENT = "This is a sample content";

    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("temp-file", ".txt"), CONTENT);
        String contentFromFile = Files.readString(path);
        log.info("\ncontent -> {}\ncontent from file -> {}", CONTENT, contentFromFile);
    }
}
