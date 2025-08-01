package Module7.Middle2;

import java.util.Scanner;

public class Player {
    private String name;
    private int playerNumber;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    private int correctInput(int playerNumber) {
        boolean correctInput = false;
        while (!correctInput) {
            if (playerNumber < 1 || playerNumber > 10) {
                System.out.println("Некорректный ввод, попробуй снова");
                playerNumber = scan.nextInt();
            } else {
                correctInput = true;
            }
        }
        return playerNumber;
    }

    public void playerNumber() {
        playerNumber = scan.nextInt();
        correctInput(playerNumber);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getName() {
        return name;
    }
}
