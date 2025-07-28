package Module6.Hard1;

import java.util.Random;

public class Game {
    private static final int SCORE = 21;
    private int ace = 11;
    private boolean winnerFound;
    private int card;
    static int computerSum;

    private Player player = new Player();
    private int[] deck = player.getDeck();
    Random random = new Random();

    public void startGame() {
        player.firstMoveOfPlayer();
        firstComputerMove();
        searchForWinner();
        if (winnerFound == true) {
            System.out.println("Игра закончена!");
            return;
        }
        while (true) {
            player.otherMoveOfPlayer();
            searchForWinner();
            if (winnerFound == true) {
                System.out.println("Игра закончена!");
                break;
            }
            otherComputerMove();
            searchForWinner();
            if (winnerFound == true) {
                System.out.println("Игра закончена!");
                break;
            }
        }
    }

    private void firstComputerMove() {
        computerSum = 0;
        int i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= SCORE & card == ace) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card);
        i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= SCORE & card == ace) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card + "\n Сумма карт = " + computerSum);
    }

    private void otherComputerMove() {
        int i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= SCORE & card == ace) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card);
    }

    private void searchForWinner() {
        if (player.getPlayerSum() == SCORE & computerSum == SCORE) {
            System.out.println("Ничья");
            winnerFound = true;
        } else if (player.getPlayerSum() > SCORE) {
            System.out.println(" Выиграл дилер. У тебя перебор: " + player.getPlayerSum());
            winnerFound = true;
        } else if (player.getPlayerSum() == SCORE) {
            System.out.println("У тебя блэкджек!");
            winnerFound = true;
        } else if (computerSum > SCORE) {
            System.out.println(" Выиграл " + player.getName() + ". Поздравляю!");
            winnerFound = true;
        } else if (computerSum == SCORE) {
            System.out.println("У дилера блэкджек! Ты проиграл!");
            winnerFound = true;
        }
    }
}
