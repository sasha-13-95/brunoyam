package Module6.Hard2;


import java.util.Random;

public class Game {
    static char[][] fieldOfComputer;
    private boolean winnerFound;
    private Player player = new Player();

    private Field field = new Field();
    Random random = new Random();

    private void preparingForTheGame() {
        field.creatingAComputerField();
        fieldOfComputer = field.getField();
        player.creatingAFieldOfPlayer();
    }

    public void game() {
        preparingForTheGame();
        while (true) {
            player.moveOfPlayer();
            searchForWinnerPlayer();
            if (winnerFound) {
                System.out.println("Игра закончена!");
                break;
            }
            computerMove();
            searchForWinnerComputer();
            if (winnerFound) {
                System.out.println("Игра закончена!");
                break;
            }
        }
    }

    private void computerMove() {
        int coordinateX;
        int coordinateY;
        boolean correctInput;
        boolean successfulMove = true;
        while (successfulMove) {
            System.out.println("Ход компьютера ");
            coordinateX = random.nextInt(10);
            coordinateY = random.nextInt(10);
            correctInput = false;
            while (!correctInput) {
                if (player.getFieldOfPlayer()[coordinateX][coordinateY] == '*' || player.getFieldOfPlayer()[coordinateX][coordinateY] == '2') {
                    coordinateX = random.nextInt(10);
                    coordinateY = random.nextInt(10);
                } else {
                    correctInput = true;
                }
            }
            if (player.getFieldOfPlayer()[coordinateX][coordinateY] == '1') {
                player.getFieldOfPlayer()[coordinateX][coordinateY] = '2';
                System.out.println("Корабль подбит!");
            } else if (player.getFieldOfPlayer()[coordinateX][coordinateY] == '0') {
                player.getFieldOfPlayer()[coordinateX][coordinateY] = '*';
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


