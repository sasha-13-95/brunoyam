package Module8.Middle3;

import java.util.Scanner;

public class WorkoutCalculator {
    private Exercises jumpingRope = new JumpingRope();
    private Exercises running = new Running();
    private Exercises swimming = new Swimming();
    private Scanner scanner = new Scanner(System.in);

    public void count() {
        System.out.println("Введи название упражнения\n Введи 1, если бег \n       2, если прыжки со скакалкой\n       3, если плаванье");
        String typeOfExercise = scanner.nextLine();
        System.out.println("Введи количество минут");
        int minutes = scanner.nextInt();
        System.out.println("Какой у тебя вес?");
        int weight = scanner.nextInt();
        switch (typeOfExercise) {
            case "1" -> {
                running.kcalCounting(weight, minutes);
            }
            case "2" -> {
                jumpingRope.kcalCounting(weight, minutes);
            }
            case "3" -> {
                swimming.kcalCounting(weight, minutes);
            }
            default -> System.out.println("Некорректные данные");
        }
    }
}
