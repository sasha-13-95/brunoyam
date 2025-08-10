package Module8.Middle3;

import java.util.Scanner;

public class Running extends Exercises {
    private Scanner scanner = new Scanner(System.in);

    public void kcalCounting(int weight, int minutes) {
        System.out.println("Сколько километров ты пробежал?");
        int kilometers = scanner.nextInt();
        int numberOfKcal = weight * kilometers;
        System.out.println("За " + minutes + " минут ты потерял " + numberOfKcal + " ккал.");
    }
}
