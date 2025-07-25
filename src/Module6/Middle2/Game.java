package Module6.Middle2;

import java.util.Random;

public class Game {
    private Player player;
    private char[][] field = new char[3][3];
    private char computerFigure;
    private boolean winnerFound;
    Random random = new Random();

    public void startGame() {
        player = new Player();
        player.choosingAFigure();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '?';
            }
        }
        player.setField(field);
    }

    public void game() {
        player.getField();
        for (int i = 0; i < 9; i++) {
            player.playersMove();
            i++;
            findTheWinner();
            if (getWinnerFound() == true) {
                break;
            }
            if (i == 9) {
                System.out.println("Ничья");
                break;
            }
            computersMove();
            findTheWinner();
            if (getWinnerFound() == true) {
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void computersMove() {
        int a;
        int b;
        computerFigure = player.getComputerFigure();
        do {
            a = random.nextInt(3);
            b = random.nextInt(3);
        }
        while (field[a][b] == 'X' || field[a][b] == '0');
        if (field[a][b] == '?') {
            field[a][b] = computerFigure;
            System.out.println("Ход компьютера: ");
            printField();
        }
    }

    private boolean getWinnerFound() {
        return winnerFound;
    }

    private void findTheWinner() {
        computerFigure = player.getComputerFigure();
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == computerFigure & field[i][0] == field[i][1] & field[i][0] == field[i][2] ||
                    field[0][i] == computerFigure & field[0][i] == field[1][i] & field[0][i] == field[2][i] ||
                    field[0][0] == computerFigure & field[0][0] == field[1][1] & field[0][0] == field[2][2] ||
                    field[2][0] == computerFigure & field[2][0] == field[1][1] & field[2][0] == field[0][2]) {
                System.out.println("Ты проиграл! Победа компьютера");
                winnerFound = true;
                break;
            } else if (field[i][0] != computerFigure & field[i][0] != '?' & field[i][0] == field[i][1] & field[i][0] == field[i][2] ||
                    field[0][i] != computerFigure & field[0][i] != '?' & field[0][i] == field[1][i] & field[0][i] == field[2][i] ||
                    field[0][0] != computerFigure & field[0][0] != '?' & field[0][0] == field[1][1] & field[0][0] == field[2][2] ||
                    field[2][0] != computerFigure & field[2][0] != '?' & field[2][0] == field[1][1] & field[2][0] == field[0][2]) {
                System.out.println("Ты выиграл!");
                winnerFound = true;
                break;
            }
        }
    }
}
