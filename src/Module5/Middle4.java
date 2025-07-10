package Module5;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = scan.nextInt();
        int res = 1;
        if (n < 0) {
            System.out.println("Некорректное значение");
        } else if (n == 0) {
            System.out.println("Факториал 0 = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                res = i * res;
            }
            System.out.println(res);
        }
    }
}
