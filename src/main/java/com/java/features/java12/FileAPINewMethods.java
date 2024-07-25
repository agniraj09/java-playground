package com.java.features.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileAPINewMethods {
    public static void main(String[] args) throws IOException {
        // Read content from a sample file
         String content =  Files.readString(Path.of("src/main/resources/sample.txt"));
        // Log the read content
         log.info("content -> {}", content);
        // Create a temporary file and write the read content to it
         Path tempFile = Files.createTempFile(Path.of("src/main/resources/"), "sample1", "txt");
        // Write content to the temporary file
         Files.writeString(tempFile, content);
        // Check if the original file and temporary file have the same content
         long ismatch = Files.mismatch(Path.of("src/main/resources/sample.txt"), tempFile);
        // Log the result of the content comparison
         log.info("ismatching -> {}", ismatch);
         Files.delete(tempFile);
    }
}
