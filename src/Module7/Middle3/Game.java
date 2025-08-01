package Module7.Middle3;

import java.util.Random;

public class Game {
    private int computerFigure;
    private Player player = new Player();
    Random random = new Random();


    public void game() {
        player.moveOfPlayer();
        computerMove();
        searchForWinner();
    }

    private void computerMove() {
        computerFigure = random.nextInt(3); // 0 - камень, 1 - ножницы, 2 - бумага
        switch (computerFigure) {
            case 0 -> System.out.println("Компьютер показал камень!");
            case 1 -> System.out.println("Компьютер показал ножницы!");
            case 2 -> System.out.println("Компьютер показал бумагу!");
        }
    }

    private void searchForWinner() {
        if (computerFigure == player.getPlayerFigure()) {
            System.out.println("Ничья");
        }
        if (computerFigure == 0 & player.getPlayerFigure() == 1) {
            System.out.println("Камень бьет ножницы, компьютер выиграл!");
        }
        if (computerFigure == 0 & player.getPlayerFigure() == 2) {
            System.out.println("Бумага накрывает камень, " + player.getName() + " выиграл!");
        }
        if (computerFigure == 1 & player.getPlayerFigure() == 0) {
            System.out.println("Камень бьет ножницы, " + player.getName() + " выиграл!");
        }
        if (computerFigure == 1 & player.getPlayerFigure() == 2) {
            System.out.println("Ножницы режут бумагу, компьютер выиграл!");
        }
        if (computerFigure == 2 & player.getPlayerFigure() == 0) {
            System.out.println("Бумага накрывает камень, компьютер выиграл!");
        }
        if (computerFigure == 2 & player.getPlayerFigure() == 1) {
            System.out.println("Ножницы режут бумагу, " + player.getName() + " выиграл!");
        }
    }
}
