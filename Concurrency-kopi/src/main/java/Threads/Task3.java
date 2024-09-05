package Threads;

public class Task3 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i <= 100; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
