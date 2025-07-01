package Module3;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три вещественных числа, после введения каждого необходимо нажать Enter");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double sum = a + b + c;
        double mul = a * b * c;
        System.out.printf("Сумма чисел = %f, произведение чисел = %f ", sum, mul);
    }
}
