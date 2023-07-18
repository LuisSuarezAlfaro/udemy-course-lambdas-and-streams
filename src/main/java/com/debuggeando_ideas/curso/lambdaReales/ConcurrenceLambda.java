package com.debuggeando_ideas.curso.lambdaReales;

import java.util.concurrent.*;

public class ConcurrenceLambda {

    static Runnable printerSum = () -> {
        long r = 0l;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i++){
            r += i;
        }
        System.out.println("Total: " + r);
    };

    static Callable<Long> getSum = () -> {
        Long r = 0l;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i++){
            r += i;
        }
        return r;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());

        var exec = Executors.newSingleThreadExecutor();
        exec.submit(printerSum);

        var result = exec.submit(getSum);
        System.out.println("Result: " + result.get());

        exec.shutdown();

    }
}
