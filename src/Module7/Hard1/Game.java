package Module7.Hard1;

public class Game {

    private Player player1 = new Player();
    private Player player2 = new Player();

    private boolean winnerFound;
    private boolean successfulMove;
    private int mistake = 15;

    private void preparingForTheGame() {
        player1.enterAWord();
        player1.getLetters();
        player2.playerField();
    }

    public void startGame() {
        preparingForTheGame();
        while (!winnerFound) {
            player2.moveOfPlayer();
            matchChecking();
            printPlayerField();
            gallows();
            if (winnerFound) {
                break;
            }
            findTheWinner();
            if (winnerFound) {
                break;
            }
        }
    }

    private void matchChecking() {
        successfulMove = false;
        for (int i = 0; i < player1.getLetters().length; i++) {
            if (player2.getEnteredLetter() == player1.getLetters()[i]) {
                player2.getPlayerField()[i] = player2.getEnteredLetter();
                successfulMove = true;
            }
        }
    }

    private void printPlayerField() {
        System.out.println("Поле игрока " + player2.getName());
        for (int i = 0; i < player2.getPlayerField().length; i++) {
            System.out.print(player2.getPlayerField()[i]);
        }
        System.out.println();
    }

    private boolean findTheWinner() {
        int remainingLetters = 0;
        for (int i = 0; i < player2.getPlayerField().length; i++) {
            if (player2.getPlayerField()[i] == '*') {
                remainingLetters++;
            }
        }
        if (remainingLetters == 0) {
            System.out.println(player2.getName() + " победил, было сделано " + player2.getCounter() + " попытки!");
            winnerFound = true;
        }
        return winnerFound;
    }

    private boolean gallows() {
        if (successfulMove == false) {
            mistake--;
            System.out.println("Не угадал, осталость " + mistake + " попыток");

            switch (mistake) {
                case 14 -> System.out.println("          \n          \n          \n          \n [        ");
                case 13 -> System.out.println("          \n          \n          \n          \n []        ");
                case 12 -> System.out.println("          \n          \n          \n  |       \n []      ");
                case 11 -> System.out.println("          \n          \n  |       \n  |       \n []       ");
                case 10 -> System.out.println("          \n  |       \n  |       \n  |       \n []       ");
                case 9 -> System.out.println("  _       \n  |       \n  |       \n  |       \n []       ");
                case 8 -> System.out.println("  __      \n  |       \n  |       \n  |       \n []       ");
                case 7 -> System.out.println("  ___     \n  |       \n  |       \n  |       \n []       ");
                case 6 -> System.out.println("  ___     \n  | |\n  |      \n  |       \n []       ");
                case 5 -> System.out.println("  ___     \n  | |\n  | O\n  |      \n []       ");
                case 4 -> System.out.println("  ___     \n  | |\n  | O\n  | |\n []       ");
                case 3 -> System.out.println("  ___     \n  | |\n  | O\n  |~|\n []       ");
                case 2 -> System.out.println("  ___     \n  | |\n  | O\n  |~|~\n []      ");
                case 1 -> System.out.println("  ___     \n  | |\n  | O\n  |~|~\n []$ ");
                case 0 -> {
                    System.out.println("  ___     \n  | |\n  | O\n  |~|~\n []$ $");
                    winnerFound = true;
                    System.out.println("Попытки кончились, " + player2.getName() + " проиграл...");
                }
            }
        }
        return winnerFound;
    }
}

