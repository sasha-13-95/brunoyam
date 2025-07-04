package Module4;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Площадь какой фигуры вы хотите вычислить (прямоугольник, треугольник, круг)?");
        String figure = scan.nextLine();
        String rectangle = "прямоугольник";
        String triangle = "треугольник";
        String circle = "круг";
        if (figure.equals(rectangle)) {
            System.out.println("Введите значения длины и ширины прямоугольника");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.println("Площадь прямоугольника = " + a * b);
        } else if (figure.equals(triangle)) {
            System.out.println("Введите значения основания и высоты треугольника");
            double c = scan.nextDouble();
            double h = scan.nextDouble();
            System.out.println("Площадь треугольника = " + c * h / 2);
        } else if (figure.equals(circle)) {
            System.out.println("Введите значение радиуса круга");
            double radius = scan.nextDouble();
            System.out.println("Площадь круга = " + Math.PI * radius * radius);
        } else {
                System.out.println("Вы ввели некорректные данные");
            }
        }
    }

