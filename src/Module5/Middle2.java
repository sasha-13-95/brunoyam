package Module5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество элементов в массиве (от 1 до 100)");
        int x = scan.nextInt();
        if (x < 1 || x > 100) {
            System.out.println("Некорректное значение");
        } else {
            double[] arrayDouble = new double[x];
            for (int i = 0; i < x; i++) {
                arrayDouble[i] = new Random().nextDouble() * 201 - 100;
            }
            double maxDouble = arrayDouble[0];
            for (int i = 1; i < x; i++) {
                if (Math.abs(maxDouble) < Math.abs(arrayDouble[i])) {
                    maxDouble = arrayDouble[i];
                }
            }
            System.out.println("Максимальный элемент массива = " + maxDouble);
            System.out.println(Arrays.toString(arrayDouble)); // для проверки правильности работы программы
        }
    }
}


