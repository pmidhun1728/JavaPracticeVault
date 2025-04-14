package Threads;

public class ExtendThread extends Thread{
    public void run() {
        System.out.println("Thread is Running....");
    }

    public static void main(String[] args) {
        ExtendThread thread = new ExtendThread();
       thread.start();
    }
}
