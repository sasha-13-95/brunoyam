package Module4;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: 6 или -2");
        int x = scan.nextInt();
        int y;
        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }
        System.out.println(y);
    }
}
