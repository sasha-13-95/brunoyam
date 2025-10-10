package Module14.Hard1;

import java.io.*;

public class MyThread extends Thread {
    private String myFile;

    public MyThread(String file) {
        this.myFile = file;
    }

    @Override
    public void run() {
        try {                                                  // c помощью этого блока можно отследить состояние RUNNABLE
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int count = 1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            while (bufferedReader.ready()) {
                String result = bufferedReader.readLine() + " - буква №" + count;
                Thread.sleep(1000);                       // отслеживаем состояние SLEEPING
                System.out.println(result);
                if (!bufferedReader.ready()) break;
                count++;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        // showBlockedStatus();
    }

    private static synchronized void showBlockedStatus() {            // данный метод позволяет отследить состояние BLOCKED у одного из потоков
        while (true) {                                                // сделала выполнение метода бесконечным, чтобы успеть отследить состояние в VisualVM
        }
    }
}
