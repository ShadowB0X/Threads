package excerise02;

class WorkerCancelable implements Runnable{
    boolean keepRunning = true;
    Thread thread;

    public void run() {
        int counter = 1;
        thread = Thread.currentThread();
        while(keepRunning){
            System.out.println("Hello");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                return;
            }
            if (counter == 3){
                cancel();
            }
            counter++;
        }
    }
    public void cancel() {
        keepRunning = false;
    }

}