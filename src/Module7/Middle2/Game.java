package Module7.Middle2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int numberOfAttempts = 0;
    private int maxNumberOfAttempts;

    private Player player = new Player();
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);

    public void startGame() {
        System.out.println("Выбери режим игры: \n 1. Без ограничения количества попыток \n 2. С ограниченным количеством попыток");
        int userSelection = scan.nextInt();
        if (userSelection == 1) {
            gameWithoutLimits();
        } else if (userSelection == 2) {
            System.out.println("Введи максимальное количество возможных попыток: ");
            maxNumberOfAttempts = scan.nextInt();
            gameWithLimits();
        } else {
            System.out.println("Некорректное значение");
        }
    }

    private void gameWithoutLimits() {
        boolean successfulMove = false;
        int computerNumber = random.nextInt(1, 11);
        System.out.println(player.getName() + ", попробуй угадать число. Введи от 1 до 10");
        while (!successfulMove) {
            player.playerNumber();
            if (player.getPlayerNumber() > computerNumber) {
                System.out.println("Загаданное число меньше");
                numberOfAttempts++;
            } else if (player.getPlayerNumber() < computerNumber) {
                System.out.println("Загаданное число больше");
                numberOfAttempts++;
            } else {
                numberOfAttempts++;
                System.out.println("Ты угадал, поздравляю, было сделано " + numberOfAttempts + " попытки.");
                successfulMove = true;
            }
        }
    }

    private void gameWithLimits() {
        boolean successfulMove = false;
        System.out.println(player.getName() + ", попробуй угадать число. Введи от 1 до 10");
        int computerNumber = random.nextInt(1, 11);
        while (!successfulMove) {
            player.playerNumber();
            if (player.getPlayerNumber() > computerNumber) {
                System.out.println("Загаданное число меньше");
                numberOfAttempts++;
                if (numberOfAttempts >= maxNumberOfAttempts) {
                    System.out.println("Ты превысил возможное количество попыток, игра закончена");
                    break;
                }
            } else if (player.getPlayerNumber() < computerNumber) {
                System.out.println("Загаданное число больше");
                numberOfAttempts++;
                if (numberOfAttempts >= maxNumberOfAttempts) {
                    System.out.println("Ты превысил возможное количество попыток, игра закончена");
                    break;
                }
            } else {
                numberOfAttempts++;
                System.out.println("Ты угадал, поздравляю, было сделано " + numberOfAttempts + " попытки");
                successfulMove = true;
            }
        }
    }
}
