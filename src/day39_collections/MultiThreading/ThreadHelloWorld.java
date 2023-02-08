package day39_collections.MultiThreading;

public class ThreadHelloWorld extends Thread{
    private final Object threadNumber;

    public ThreadHelloWorld(int threadNumber) {
       this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello world "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
