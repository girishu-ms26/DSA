package Interview;

public class MultiThreading extends Thread {
    public static void main(String[]args) {
        MultiThreading threading = new MultiThreading();
        threading.start();
    }
    public void run(){
        System.out.println("running");
    }
}
class Running implements Runnable {

    @Override
    public void run() {
        System.out.println("running runnable");
    }

    public static void main(String[]args) {
        Running running = new Running();
        running.run();
    }
}
