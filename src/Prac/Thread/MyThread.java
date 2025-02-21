package Prac.Thread;

public class MyThread extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("Потік завершив роботу");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
}
