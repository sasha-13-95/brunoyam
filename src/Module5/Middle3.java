package Module5;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите наутральное число от 1 до 100");
        int n = scan.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("Некорректное значение");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}