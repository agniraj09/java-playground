package com.java.features.java12;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileUtils {
    public static void main(String[] args) throws IOException {
      String content =  Files.readString(Path.of("src/main/resources/sample.txt"));
      log.info("content -> {}", content);

      Path tempFile = Files.createTempFile(Path.of("src/main/resources/"), "sample1", "txt");
        Files.writeString(tempFile, content);
      long ismatch = Files.mismatch(Path.of("src/main/resources/sample.txt"), tempFile);
      log.info("ismatching -> {}", ismatch);

      //Files.delete(tempFile);


    }
}
