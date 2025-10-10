package Module14.Middle2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonTask());
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stopped");
    }
}
