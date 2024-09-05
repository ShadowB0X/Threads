package Threads;

public class Task1 implements Runnable{
    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i <= 10000; i++) {
            sum += i;
            System.out.println(i);
        }
    }
}
