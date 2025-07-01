package Module3;

import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки А");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Введите координаты точки B");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.println("Введите координаты точки C");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double ab = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double bc = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double ac = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double p = (ab + bc + ac) / 2; // вычисляю полупериметр
        double s = Math.sqrt(p * ((p - ab) * (p - bc) * (p - ac)));
        System.out.println("Площадь треугольника = " + s);
    }
}
