package Module6.Middle4;

import java.util.Random;

public class Game {
    Random random = new Random();
    private Player player1;
    private Player player2;
    private int sum = 0;
    private int counter1 = 0;
    private int counter2 = 0;
    private int randomNumber;
    private boolean player1Won;
    private boolean player2Won;

    public void startGame() {
        System.out.print("Игрок № 1, ");
        player1 = new Player();
        System.out.print("Игрок № 2, ");
        player2 = new Player();
        randomNumber = random.nextInt(1, 101);
        System.out.println("Компьютер загадал " + randomNumber); // вывожу, чтобы проверить себя, правильно ли работает программа
    }

    public void addingNumbers() {
        while (true) {
            int playerNumber1 = player1.playerMove();
            player1.setCounterPlayer1(counter1);
            System.out.println("Игрок " + player1.getName() + " загадал " + playerNumber1);
            sum = playerNumber1 + sum;
            if (sum > randomNumber) {
                System.out.println("Игра закончена");
                player2Won = true;
                break;
            } else {
                counter1 = player1.getCounterPlayer1();
            }
            int playerNumber2 = player2.playerMove();
            player2.setCounterPlayer2(counter2);
            System.out.println("Игрок " + player2.getName() + " загадал " + playerNumber2);
            sum = sum + playerNumber2;
            if (sum > randomNumber) {
                System.out.println("Игра закончена");
                player1Won = true;
                break;
            } else {
                counter2 = player2.getCounterPlayer2();
            }
        }
    }

    public void searchForWinner() {
        if (player1Won) {
            System.out.println("Игрок " + player1.getName() + " победил!");
            System.out.println(player1.getName() + " загадал " + counter1 + " числа / чисел");
        }
        if (player2Won) {
            System.out.println("Игрок " + player2.getName() + " победил!");
            System.out.println(player2.getName() + " загадал " + counter2 + " числа / чисел");
        }

    }
}
