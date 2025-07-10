package Module5;


import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        int[] arrayInt = new int[a];
        arrayInt[0] = 0;
        arrayInt[1] = 1;
        System.out.print(arrayInt[0]);
        System.out.print(arrayInt[1]);
        for (int i = 2; i < arrayInt.length; i++) {
            arrayInt[i] = arrayInt[i - 2] + arrayInt[i - 1];
            System.out.print(arrayInt[i]);
        }
    }
}
