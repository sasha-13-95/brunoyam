package Module14.Hard1;


public class Main {
    public static void main(String[] args) throws Exception {
        Thread myThread1 = new MyThread("RussianAlphabet.txt");
        Thread myThread2 = new MyThread("EnglishAlphabet.txt");
        System.out.println(myThread1.getState());                      // состояние потока myThread1 NEW
        System.out.println(myThread2.getState());                      // состояние потока myThread2 NEW
        myThread1.start();                                             // изначально состояние RUNNABLE в течение 30 секунд, затем RUNNING у myThread1
        System.out.println(myThread1.getState());
        myThread1.join();                                              // поток main находится в состоянии WAITING
        System.out.println(myThread1.getState());                      // после того, как работа завершена у потока myThread1 состояние TERMINATED
        myThread2.start();                                             // изначально состояние RUNNABLE в течение 30 секунд, затем RUNNING у myThread2
        System.out.println(myThread2.getState());
    }
}

