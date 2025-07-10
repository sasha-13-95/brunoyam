package Module5;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        while (true) {
            System.out.println("Результат = " + Math.pow(a, n));
            System.out.println("Введите число и степень");
            a = scanner.nextInt();
            n = scanner.nextInt();
        }
    }
}
