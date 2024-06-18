package com.java.features.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileAPINewMethods {
    public static void main(String[] args) throws IOException {
        Path file1Path = Path.of("src/main/resources/sample.txt");
        String file1Content = Files.readString(file1Path);
        log.info("file1Content -> {}", file1Content);

        Path file2Path = Files.createTempFile(Path.of("src/main/resources/"), "sample1", "txt");
        Files.writeString(file2Path, file1Content);

        long firstNonMatchingCharByte = Files.mismatch(file1Path, file2Path);
        log.info("firstNonMatchingCharByte -> {}", firstNonMatchingCharByte);

        Files.delete(file2Path);
    }
}
