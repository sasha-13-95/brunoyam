package Module8.Middle3.Exercises;

import java.util.Scanner;

public class Running extends Exercise {
    private Scanner scanner = new Scanner(System.in);
    private static final float INTENSITY_FACTOR = 1.2f; // взяла коэффициент среднего бега.

    public float kcalCounting(int weight, int minutes) {
        System.out.println("Сколько километров ты пробежал?");
        float kilometer = scanner.nextFloat();
        float numberOfKcal = (kilometer / minutes * 60) * weight * INTENSITY_FACTOR;
        return numberOfKcal;
    }
}
