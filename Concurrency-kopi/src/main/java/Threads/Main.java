package Threads;

public class Main {
    public static void main(String[] args) {
       // PrintJob a = new PrintJob("A", "Hello", 5);
       // Thread t1 = new Thread(a);
       // t1.start();

//        Task1 task1 = new Task1();
//        Thread thread1 = new Thread(task1);
//        thread1.start();

       Task2 task2 = new Task2();
       Thread thread2 = new Thread(task2);
       thread2.start();

//       Task3 task3 = new Task3();
//       Thread thread3 = new Thread(task3);
//       thread3.start();
    }
}
