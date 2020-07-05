package com.java_impove.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        //有最大线程限制
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 20; i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
