package Module5;

import java.util.*;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива (от 1 до 1000) ");
        int a = scan.nextInt();
        if (a < 1 || a > 1000) {
            System.out.println("Вы ввели некорректное значение");
        }
        int[] arrayInt1 = new int[a];
        for (int i = 0; i < arrayInt1.length; i++) {
            System.out.print("Введите значение элемента массива (положительное число от 1 до 1000 включительно) ");
            int b = scan.nextInt();
            if (b < 1 || b > 1000) {
                System.out.println("Вы ввели некорректное значение");
                break;
            } else {
                arrayInt1[i] = b;
            }
        }
        System.out.println(Arrays.toString(arrayInt1));
        for (int j = 0; j < arrayInt1.length; j++) {
            for (int h = 1; h < arrayInt1.length; h++)
                if (h != j) {
                    if (arrayInt1[j] == arrayInt1[h]) {
                        arrayInt1[h] = 0;
                    }
                }
        }
        System.out.println(Arrays.toString(arrayInt1));
        List<Integer> arrayInt2 = new ArrayList<>();
        for (int g = 0; g < arrayInt1.length; g++) {
            if (arrayInt1[g] != 0) {
                arrayInt2.add(arrayInt1[g]);
            }
        }
        System.out.println(arrayInt2.toString());
    }
}
/* Пыталась решить задачу так:
преобразовать статический массив в динамический и в динамическом удалить те элементы, значение которых равно 0.
List <Integer> arrayInt2 = new ArrayList <> (Arrays.asList (arrayInt1));
for (int g = 0; g < arrayInt2.size(); g++) {
if (arrayInt2.get(g) ==0) {
arrayInt2.remove (g);
}
но в некоторых случаях 0 все таки оставался в динамическом массиве, я так поняла, что из-за того, что элементы постоянно сдвигались, поэтому решила по-другому
 */