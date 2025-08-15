package Module8.Middle3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WorkoutCalculator workoutCalculator = new WorkoutCalculator();
        System.out.println("Введи название упражнения\n Введи 1, если бег \n       2, если прыжки со скакалкой\n       3, если плаванье");
        String typeOfExercise = scan.nextLine();
        System.out.println("Введи количество минут, потраченных на тренировку");
        int minutes = scan.nextInt();
        System.out.println("Введи свой вес");
        int weight = scan.nextInt();
        float numberOfKcal = workoutCalculator.calculatorWork(typeOfExercise, minutes, weight);
        System.out.println("Ты потерял " + numberOfKcal + " ккал.");
    }
}

