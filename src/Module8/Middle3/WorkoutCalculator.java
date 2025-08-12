package Module8.Middle3;

import Module8.Middle3.Exercises.Exercise;
import Module8.Middle3.Exercises.JumpingRope;
import Module8.Middle3.Exercises.Running;
import Module8.Middle3.Exercises.Swimming;

import java.util.Scanner;

public class WorkoutCalculator {
    private Exercise exercise;
    private int minutes;
    private int weight;
    private Scanner scanner = new Scanner(System.in);

    public void count(Exercise exercise) {
        if (exercise instanceof Running) {
            exercise.kcalCounting(weight, minutes);
        }
        if (exercise instanceof JumpingRope) {
            exercise.kcalCounting(weight, minutes);
        }
        if (exercise instanceof Swimming) {
            exercise.kcalCounting(weight, minutes);
        }
    }

    public void calculatorWork() {
        System.out.println("Введи название упражнения\n Введи 1, если бег \n       2, если прыжки со скакалкой\n       3, если плаванье");
        String typeOfExercise = scanner.nextLine();
        System.out.println("Введи количество минут");
        minutes = scanner.nextInt();
        System.out.println("Какой у тебя вес?");
        weight = scanner.nextInt();
        switch (typeOfExercise) {
            case "1" -> {
                exercise = new Running();
            }
            case "2" -> {
                exercise = new JumpingRope();
            }
            case "3" -> {
                exercise = new Swimming();
            }
            default -> System.out.println("Некорректные данные");
        }
        count(exercise);
    }
}
