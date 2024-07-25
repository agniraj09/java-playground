package com.java.features.java8;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.random.RandomGenerator;

public class CompletableFutureUseCase {

    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        System.out.println(start);
        var futures = List.of(
                CompletableFuture.supplyAsync(() -> CompletableFutureUseCase.getRandomNumber(2000))
                        .thenApplyAsync(value -> {
                            try {
                                System.out.println(System.currentTimeMillis());
                                Thread.sleep(10000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            return value;
                        })
                        .exceptionally(e -> {
                            System.out.println(e.getMessage());
                            return 0;
                        })
                        .thenApply(value -> {
                            System.out.println(System.currentTimeMillis());
                            System.out.println(value * value);
                            return value;
                        }),
                CompletableFuture.supplyAsync(() -> CompletableFutureUseCase.getRandomNumber(4000)),
                CompletableFuture.supplyAsync(() -> CompletableFutureUseCase.getRandomNumber(6000)));

        CompletableFuture<Void> all = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        all.join();
        System.out.println("Joined all");
        futures.forEach(f -> {
            System.out.println(f.join());
        });

        System.out.println(System.currentTimeMillis() - start);
    }

    private static Integer getRandomNumber(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return RandomGenerator.getDefault().nextInt();
    }
}
