package Module3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String s = scan.nextLine();
        System.out.println("Длина введеного приложения - " + s.length() + " символа(ов)");
    }
}
