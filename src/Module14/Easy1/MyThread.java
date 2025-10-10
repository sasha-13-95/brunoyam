package Module14.Easy1;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}