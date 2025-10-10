package Module14.Middle2;

public class DaemonTask implements Runnable {
    private static int count = 0;

    @Override
    public void run() {
        System.out.println("start");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(++count);
        }
    }
}
