package Module14.Middle1;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
