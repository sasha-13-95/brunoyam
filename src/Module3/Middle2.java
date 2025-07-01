package Module3;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения переменных a, b, c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("Дискриминант уравнения = " + discriminant);
    }
}
