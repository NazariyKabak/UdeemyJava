package Prac.Thread;

public class Store {
    private int product = 0;

    public synchronized void produce() throws InterruptedException{
        while (product > 0){
            wait();
        }

        product++;
        System.out.println("Producer added 1 product");
        notify();
    }


    public synchronized void consume() throws InterruptedException{
        while (product == 0){
            wait();
        }

        product--;
        System.out.println("Consumer consumed 1 product");
        notify();
    }
}
