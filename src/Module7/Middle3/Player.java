package Module7.Middle3;

import java.util.Scanner;

public class Player {
    private String name;
    private int playerFigure;
    private int userValue;
    private Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    private int correctInput(int userValue) {
        boolean correctInput = false;
        while (!correctInput) {
            if (userValue < 0 || userValue > 2) {
                System.out.println("Некорректный ввод, попробуй снова");
                userValue = scan.nextInt();
            } else {
                correctInput = true;
            }
        }
        return userValue;
    }

    public void moveOfPlayer() {
        System.out.println("Введи свою фигуру:\n Если ты выбрал камень, то 0 \n Если ты выбрал ножницы, то 1 \n Если ты выбрал бумагу, то 2");
        userValue = scan.nextInt();
        playerFigure = correctInput(userValue);
        switch (playerFigure) {
            case 0 -> System.out.println(name + " показал камень!");
            case 1 -> System.out.println(name + " показал ножницы!");
            case 2 -> System.out.println(name + " показал бумагу!");
        }
    }

    public int getPlayerFigure() {
        return playerFigure;
    }

    public String getName() {
        return name;
    }
}
