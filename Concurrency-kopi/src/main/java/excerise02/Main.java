package excerise02;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WorkerCancelable worker = new WorkerCancelable();
        Thread t = new Thread(worker);
        t.start();
        Thread.sleep(4000);
        t.interrupt();


        System.out.println("DONE");




    }
}
