package Module5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива (от 1 до 10)");
        int x = scan.nextInt();
        if (x <= 0 || x > 10) {
            System.out.println("Некорректное значение");
        } else {
            int[][] arrayInt = new int[x][x];
            {
                for (int i = 0; i < x; i++) {
                    for (int a = 0; a < x; a++) {
                        arrayInt[i][a] = new Random().nextInt(11);
                    }
                }
                int res = arrayInt[0][0];
                int b = 1;
                int c = 1;
                while (b < x || c < x) {
                    res += arrayInt[b][c];
                    b ++;
                    c ++;
                }
                System.out.println("Результат = " + res);
                System.out.println(Arrays.deepToString(arrayInt)); // выводим массив для проверки работы программы
            }
        }
    }
}
