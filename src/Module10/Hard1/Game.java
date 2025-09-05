package Module10.Hard1;

import Module10.Hard1.Heroes.*;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Hero hero;
    private Hero opponent;
    private boolean winnerFound;

    public Game() {
        System.out.println("Добро пожаловать в игру!");
        while (hero == null) {
            System.out.println("Выбери персонажа: введи 1, если капитан Америка\n                        2, если Железный человек\n                        3, если Человек-паук");
            hero = chooseAHero(scanner.nextLine());
        }
        opponent = chooseOpponent();
    }

    public void startGame() {
        System.out.println("Ты ходишь первым");
        while (!winnerFound) {
            hero.playerAttack(opponent);
            findTheWinner(opponent);
            if (winnerFound) {
                System.out.println("Поздравляю, ты выиграл!");
                return;
            }
            opponentAttack(hero);
            findTheWinner(hero);
            if (winnerFound) {
                System.out.println("Компьютер выиграл :(");
            }
        }
    }

    private Hero chooseAHero(String name) {
        switch (name) {
            case "1" -> {
                hero = new CaptainAmerica();
            }
            case "2" -> {
                hero = new IronMan();
            }
            case "3" -> {
                hero = new SpiderMan();
            }
            default -> System.out.println("Некорректное значение");
        }
        return hero;
    }

    private Hero chooseOpponent() {
        int numberOfOpponent = random.nextInt(1, 3);
        switch (numberOfOpponent) {
            case 1 -> {
                System.out.println("Компьютер играет за Зеленого гоблина");
                opponent = new GreenGoblin();
            }
            case 2 -> {
                System.out.println("Компьютер играет за Таноса");
                opponent = new Thanos();

            }
        }
        return opponent;
    }

    private void opponentAttack(Hero hero) {
        int hittingTheTarget = random.nextInt(0, 2);
        if (hittingTheTarget == 0) {
            System.out.println(opponent.getName() + " не попал в " + hero.getName());
        } else {
            int healthScale = hero.getHealthScale() - opponent.getWeapon();
            hero.setHealthScale(healthScale);
            System.out.println(opponent.getName() + " нанес урон " + hero.getName() + ". У " + hero.getName() + " осталось " + hero.getHealthScale() + " баллов здоровья");
        }
    }

    private boolean findTheWinner(Hero character) {
        if (character.getHealthScale() <= 0) {
            System.out.println("Игра окончена! " + character.getName() + " проиграл");
            winnerFound = true;
        }
        return winnerFound;
    }
}
