package Module5;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pow = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res = res * num;
        }
        System.out.println("Результат = " + res);
    }
}
