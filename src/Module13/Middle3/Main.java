package Module13.Middle3;

import java.util.Scanner;

import static Module13.Middle3.LetterCalculator.calculating;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        System.out.println("В вашем тексте " + calculating(scanner.nextLine()) + " символа (-ов).");
    }
}

