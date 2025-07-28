package Module6.Middle4;

import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private int playerNumber;
    private String name;
    private int counter1 = 0;
    private int counter2 = 0;


    public Player() {
        System.out.println("введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    public String getName() {
        return name;
    }

    public int playerMove() {
        boolean correctInput = false;
        System.out.println(name + ", введи число от 1 до 100");
        playerNumber = scan.nextInt();
        while (!correctInput) {
            if (playerNumber < 1 || playerNumber > 100) {
                System.out.println("Некорректный ввод, попробуй снова");
                playerNumber = scan.nextInt();
            } else {
                correctInput = true;
            }
        }
        return playerNumber;
    }

    public void setCounterPlayer1(int counter) {
        this.counter1 = counter;
    }

    public int getCounterPlayer1() {
        counter1++;
        return counter1;
    }

    public void setCounterPlayer2(int counter) {
        this.counter2 = counter;
    }

    public int getCounterPlayer2() {
        counter2++;
        return counter2;
    }
}
