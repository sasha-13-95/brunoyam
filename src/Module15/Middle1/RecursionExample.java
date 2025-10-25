package Module15.Middle1;

import java.util.Scanner;

public class RecursionExample {
    public static int i = 0;

    public static void printNumber(int n) {
        System.out.print(i + " ");
        i++;
        if (i > n) return;
        printNumber(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        printNumber(scanner.nextInt());
    }
}
