package Module4;

import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите параметры a, b, c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            System.out.println("У квадратного уравнения есть действительные корни");
        } else {
            System.out.println("У квадратного уравнения нет действительных корней");
        }
    }
}
