package com.lowleveldesign.designpatterns.creational.singleton;

import org.apache.tomcat.util.threads.VirtualThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public enum SingletonConnection {

    INSTANCE("Creating singleton class");

    private String message;

    private SingletonConnection(String message) {
        this.message = message;
    }
    public static SingletonConnection getInstance() {
         return INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws InterruptedException {
        SingletonConnection object = SingletonConnection.INSTANCE;
        System.out.println(object.hashCode() + " : " + object.getMessage());

        SingletonConnection object2 = SingletonConnection.INSTANCE;

        object2.setMessage("Creating object from outside");
        System.out.println(object2.hashCode() + " : " + object2.getMessage());
        System.out.println(object2.hashCode() + " : " + object2.getMessage());

        // Create an ExecutorService that uses virtual threads
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        // Submit multiple tasks to the executor
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " running in virtual thread: " + Thread.currentThread().getName());
                try {
                    SingletonConnection object3 = SingletonConnection.INSTANCE;

                    object2.setMessage("Creating object from outside with Virtual threads");
                    System.out.println(object2.hashCode() + " : " + object2.getMessage());
                    // Simulate some work
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shut down the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("All tasks completed.");
    }
}
