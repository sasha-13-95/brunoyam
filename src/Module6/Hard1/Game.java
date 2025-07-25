package Module6.Hard1;

public class Game {
    private Player player;
    private boolean winnerFound;

    public Game() {
        player = new Player();
    }

    public void startGame() {
        player.firstMoveOfPlayer();
        player.firstComputerMove();
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
            player.otherComputerMove();
            searchForWinner();
            if (winnerFound == true) {
                System.out.println("Игра закончена!");
                break;
            }
        }
    }

    public void searchForWinner() {
        if (player.getPlayerSum() == 21 & player.getComputerSum() == 21) {
            System.out.println("Ничья");
            winnerFound = true;
        } else if (player.getPlayerSum() > 21) {
            System.out.println(" Выиграл дилер. У тебя перебор: " + player.getPlayerSum());
            winnerFound = true;
        } else if (player.getPlayerSum() == 21) {
            System.out.println("У тебя блэкджек!");
            winnerFound = true;
        } else if (player.getComputerSum() > 21) {
            System.out.println(" Выиграл " + player.getName() + ". Поздравляю!");
            winnerFound = true;
        } else if (player.getComputerSum() == 21) {
            System.out.println("У дилера блэкджек! Ты проиграл!");
            winnerFound = true;
        }
    }
}
