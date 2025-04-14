package Threads;

public class ThreadExtend extends Thread{
    public void run() {
        System.out.println("Thread is Running....");
    }

    public static void main(String[] args) {
        ThreadExtend thread = new ThreadExtend();
       thread.start();
    }
}
