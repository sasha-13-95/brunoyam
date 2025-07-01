package Module3;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scan.nextInt();
        System.out.println("Введите еще одно целое число");
        int b = scan.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.printf("Пользователь ввел значения для a = %d, для b = %d", a, b);
    }
}
