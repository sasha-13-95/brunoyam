package Module6.Hard2;


import java.util.Random;

public class Game {
    static char[][] fieldOfComputer;
    private boolean successfulMove;
    private boolean winnerFound;
    private Player player;
    Random random = new Random();
    Field field = new Field();

    public Game() {
        player = new Player();
    }

    private void preparingForTheGame() {
        field.creatingAComputerField();
        fieldOfComputer = field.getField();
        printComputerField();
        player.creatingAFieldOfPlayer();
    }

    public void game() {
        preparingForTheGame();
        while (true) {
            player.moveOfPlayer();
            searchForWinnerPlayer();
            if (winnerFound == true) {
                System.out.println("Игра закончена!");
                break;
            }
            computerMove();
            searchForWinnerComputer();
            if (winnerFound == true) {
                System.out.println("Игра закончена!");
                break;
            }
        }
    }

    private void computerMove() {
        int a;
        int b;
        do {
            do {
                System.out.println("Ход компьютера ");
                a = random.nextInt(10);
                b = random.nextInt(10);
            }
            while (player.getFieldOfPlayer()[a][b] == '*' || player.getFieldOfPlayer()[a][b] == '2');
            if (player.getFieldOfPlayer()[a][b] == '1') {
                player.getFieldOfPlayer()[a][b] = '2';
                System.out.println("Корабль подбит!");
                successfulMove = true;
            } else {
                player.getFieldOfPlayer()[a][b] = '*';
                System.out.println("Мимо!");
                successfulMove = false;
            }
            player.printFieldOfPlayer();
            int sum = 0;
            for (int c = 0; c < player.getFieldOfPlayer().length; c++) {
                for (int d = 0; d < player.getFieldOfPlayer().length; d++) {
                    if (fieldOfComputer[c][d] == '2') {
                        sum++;
                        if (sum == 20) {
                            return;
                        }
                    }
                }
            }
        }
        while (successfulMove == true);
    }


    static void printComputerField() {
        System.out.println("Поле компьютера: ");
        for (int i = 0; i < fieldOfComputer.length; i++) {
            for (int j = 0; j < fieldOfComputer.length; j++) {
                System.out.print(fieldOfComputer[i][j] + " ");
            }
            System.out.println();
        }
    }


    private boolean searchForWinnerPlayer() {
        int sum = 0;
        for (int i = 0; i < fieldOfComputer.length; i++) {
            for (int j = 0; j < fieldOfComputer.length; j++) {
                if (fieldOfComputer[i][j] == '2') {
                    sum++;
                    if (sum == 20) {
                        winnerFound = true;
                        System.out.println(player.getName() + " выиграл!");
                    }
                }
            }
        }
        return winnerFound;
    }

    private boolean searchForWinnerComputer() {
        int sum = 0;
        for (int c = 0; c < player.getFieldOfPlayer().length; c++) {
            for (int d = 0; d < player.getFieldOfPlayer().length; d++) {
                if (fieldOfComputer[c][d] == '2') {
                    sum++;
                    if (sum == 20) {
                        winnerFound = true;
                        System.out.println("Компьютер выиграл!");
                    }
                }
            }
        }
        return winnerFound;

    }
}


