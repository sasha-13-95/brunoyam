package Module5;

import java.util.Random;
import java.util.Scanner;

public class Middle6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int a = new Random().nextInt(8) + 1;
            int b = new Random().nextInt(8) + 1;
            int result = a * b;
            System.out.printf("Решите пример: %d * %d\n", a, b);
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            if (answer == result) {
                System.out.println("Ответ верный");
            } else {
                System.out.printf("Ответ неверный. %d * %d = %d\n", a, b, result);
            }
        }
    }
}
