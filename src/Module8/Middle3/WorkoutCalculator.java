package Module8.Middle3;

import Module8.Middle3.Exercises.Exercise;
import Module8.Middle3.Exercises.JumpingRope;
import Module8.Middle3.Exercises.Running;
import Module8.Middle3.Exercises.Swimming;

import java.util.Scanner;

public class WorkoutCalculator {
    private Scanner scanner = new Scanner(System.in);

    public float calculatorWork(String typeOfExercise, int minutes, int weight) {
        float numberOfKcal;
        switch (typeOfExercise) {
            case "1" -> {
                Exercise exercise = new Running();
                numberOfKcal = exercise.kcalCounting(weight, minutes);
            }
            case "2" -> {
                Exercise exercise = new JumpingRope();
                numberOfKcal = exercise.kcalCounting(weight, minutes);
            }
            case "3" -> {
                Exercise exercise = new Swimming();
                numberOfKcal = exercise.kcalCounting(weight, minutes);
            }
            default -> {
                System.out.println("Некорректные данные");
                numberOfKcal = 0;
            }
        }
        return numberOfKcal;
    }
}
