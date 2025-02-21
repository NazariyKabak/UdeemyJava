package Prac.Thread;

public class MyRunnable extends Thread{
    public void run(){
        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
}
