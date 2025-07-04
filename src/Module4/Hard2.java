package Module4;

import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты пешки");
        char pawn1 = scan.next().charAt(0);
        int pawn2 = scan.nextInt();
        System.out.println("Введите координаты слона");
        char bishop1 = scan.next().charAt(0);
        int bishop2 = scan.nextInt();
        if (pawn2 >= 9 || pawn2 <= 0 || bishop2 >= 9 || pawn2 <= 0) {
            System.out.println("Вы ввели некорректные данные");
            return;
        } else if (pawn1 <= 64 || pawn1 >= 73 || bishop1 <= 64 || bishop1 >= 73) {
            System.out.println("Вы ввели некорректные данные");
            return;
        }
        int result1 = Math.abs(pawn1 - bishop1);
        int result2 = Math.abs(pawn2 - bishop2);
        if (result1 == result2) {
            System.out.println("Пешка под боем слона");
        } else {
            System.out.println("Пешка не находится под боем слона");
        }
    }
}
