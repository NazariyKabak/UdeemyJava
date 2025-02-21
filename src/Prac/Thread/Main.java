package Prac.Thread;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        myThread.join();
//        System.out.println("Main thread is running");
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();

//        try {
//            System.out.println("Очікування 3 секунди");
//            Thread.sleep(3000);
//            System.out.println("3 секунди пройшли");
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for (int i = 1; i <=5 ; i++) {
//            final int taskId = i;
//            executorService.submit(()-> {
//                System.out.println("Task " + taskId + " is running");
//            });
//
//        }
//        executorService.shutdown();
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
//        Callable<Integer> task = () -> {
//            Thread.sleep(2000);
//            return 42;
//        };
//        Future<Integer> future = executorService2.submit(task);
//        System.out.println("Future done? " + future.isDone());
//        System.out.println("Waiting for the result");
//        System.out.println("Result: " + future.get());
//
//        executorService2.shutdown();
//        task1();
//        System.out.println("Кількість доступних ядер: " + Runtime.getRuntime().availableProcessors());
        task7();
//        System.out.println("Main thread is running");
    }

    public static void task1(){
        System.out.println("Task 1 is running");
        Thread thread = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread.start();
        thread2.start();

    }

    public static void task2(){
        Thread thread = new Thread(()->{
            try {
                System.out.println("Task 2 is running " + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("Task 2 is done");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        thread.start();
    }

    public static void task3(){
        for (int i = 1; i <=10; i++) {
            final int taskId = i;
            Thread thread = new Thread(()->{
                System.out.println("Task " + taskId + " is running");
            });
            thread.start();
        }
    }

    public static void task4(){
        BankAccount account = new BankAccount("100", 678.45);
        Thread thread1 = new Thread(()->{
            account.deposit(300);
            account.withdraw(50);
        });


        System.out.println("Account balance: " + account.getBalance());
        Thread thread2 = new Thread(()->{
            account.deposit(203.75);
            account.withdraw(100);
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Account balance: " + account.getBalance());

    }

    public static void task5(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <=5 ; i++) {
            final int taskId = i;
            executorService.submit(()-> {
                System.out.println("Task " + taskId + " is running " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " is done");

            });

        }
        executorService.shutdown();
    }

    public static void task6(){
        Store store = new Store();
        Thread producer = new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                try {
                    store.produce();
                    System.out.println("Producer added 1 product");
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                try {
                    store.consume();
                    System.out.println("Consumer consumed 1 product");
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void task7(){
        Random random = new Random();
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return random.nextInt(100);
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> future = executorService.submit(task);
        try {
            System.out.println("Future done? " + future.isDone());
            System.out.println("Waiting for the result");
            System.out.println("Result: " + future.get());
            System.out.println("Future done? " + future.isDone());
    }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executorService.shutdown();
    }

}
