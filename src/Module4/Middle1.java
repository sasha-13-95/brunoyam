package Module4;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 разных целых числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("Вы ввели одинаковые числа");
            return;
        }
        if (Math.min(a, b) > c) {
            System.out.println("min: " + c);
        } else {
            System.out.println("min: " + Math.min(a, b));
        }
        if (Math.max(a, b) < c) {
            System.out.println("max: " + c);
        } else {
            System.out.println("max: " + Math.max(a, b));
        }
        if (Math.min(a, b) > c & Math.min(a, b) == a) {
            System.out.println("mid: " + a);
        } else if (Math.min(a, b) < c & Math.max(a, b) > c) {
            System.out.println("mid: " + c);
        } else {
            System.out.println("mid: " + b);
        }
    }
}
