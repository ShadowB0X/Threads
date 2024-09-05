package Threads;

public class Printer {

    private static Printer printer = new Printer();

    public void print(PrintJob job) throws InterruptedException {
        for (int i = 0; i < job.getNoOfPrints(); i++) {
            System.out.println(job.getJobName() + ": " + job.getMsg());
        }
//        Thread.sleep(1000);
    }


    public static Printer getPrinter() {
        return printer;
    }

}
