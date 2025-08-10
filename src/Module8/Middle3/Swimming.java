package Module8.Middle3;

import java.util.Scanner;

public class Swimming extends Exercises {
    private static final float METABOLIC_RATE = 3.5f; // Константа, представляющая собой скорость метаболизма
    private static final int CONVERSION_FACTOR = 200; // Константа, представляющая собой коэффициент перевода в килокалории
    private float met; // Коэффициент MET (метаболический эквивалент)
    private float numberOfKcal;
    private boolean correctInput;
    private Scanner scanner = new Scanner(System.in);

    public void kcalCounting(int weight, int minutes) {
        while (!correctInput) {
            System.out.println("Каким стилем ты плавал?\n Введи 1, если брасс \n       2, если кроль\n       3, если баттерфляй");
            String swimmingStyle = scanner.nextLine();
            switch (swimmingStyle) {
                case "1" -> {
                    met = 5.3f;
                    numberOfKcal = (METABOLIC_RATE * met * weight / CONVERSION_FACTOR) * minutes;
                    correctInput = true;
                }
                case "2" -> {
                    met = 8.3f;
                    numberOfKcal = (METABOLIC_RATE * met * weight / CONVERSION_FACTOR) * minutes;
                    correctInput = true;
                }
                case "3" -> {
                    met = 13.8f;
                    numberOfKcal = (METABOLIC_RATE * met * weight / CONVERSION_FACTOR) * minutes;
                    correctInput = true;
                }
                default -> {
                    System.out.println("Некорректные данные");
                    correctInput = false;
                }
            }
            if (correctInput) {
                System.out.println("За " + minutes + " минут ты потерял " + numberOfKcal + " ккал.");
            }
        }
    }
}