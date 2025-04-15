package Threads.ExecutoService.CreateThread;

public class ImplementThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ImplementThread());
        thread.start();
    }
}
