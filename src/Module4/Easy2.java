package Module4;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Вы ввели некорректное значение");
        }
    }
}
