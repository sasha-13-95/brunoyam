package Module4;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 разных числа");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x == y) {
            System.out.println("Вы ввели одинаковые числа");
            return;
        }
        int resultMax = Math.max(x, y);
        int resultMin = Math.min(x, y);
        if (resultMax % resultMin == 0) {
            System.out.println("Кратные числа");
        } else {
            System.out.println("Некратные числа, остаток от деления = " + (resultMax % resultMin));
        }
    }
}
