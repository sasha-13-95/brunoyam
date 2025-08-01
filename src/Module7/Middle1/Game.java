package Module7.Middle1;

import java.util.Scanner;

public class Game {
    private Thimble thimble = new Thimble();
    private Player player = new Player();
    Scanner scanner = new Scanner(System.in);

    private int correctInput(int answer) {
        boolean correctInput = false;
        while (!correctInput) {
            if (answer < 1 || answer > 3) {
                System.out.println("Некорректный ввод, попробуй снова");
                answer = scanner.nextInt();
            } else {
                correctInput = true;
            }
        }
        return answer;
    }

    public void startGame() {
        System.out.println("Введи номер наперстка (1,2 или 3)");
        while (player.getWinCounter() != 3) {
            int answer = scanner.nextInt();
            answer = correctInput(answer);
            int realNumber = thimble.showNumberThimble();
            if (answer == realNumber) {
                player.increaseWinCounter();
            } else {
                System.out.println("Не угадал, попробуй еще");
            }
            System.out.println("Ты угадал " + player.getWinCounter() + " разa.");
        }
    }
}
