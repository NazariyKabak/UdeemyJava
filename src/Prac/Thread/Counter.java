package Prac.Thread;

public class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public void getCount(){
        System.out.println(count);
    }
}
