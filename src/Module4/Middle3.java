package Module4;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения сторон треугольника");
        double ab = scan.nextDouble();
        double bc = scan.nextDouble();
        double ac = scan.nextDouble();
        if (ab == 0 || bc == 0 || ac == 0) {
            System.out.println("Вы ввели некорректное значение");
            return;
        }
        if (ab + bc < ac || ab + ac < bc || bc + ac < ab) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
