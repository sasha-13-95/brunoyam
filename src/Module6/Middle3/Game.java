package Module6.Middle3;


import java.util.Random;

public class Game {
    private Player player;
    private String[] field = new String[20];
    private int sumOfSticks;
    private int numberOfSticks;
    private boolean winnerFound;
    Random random = new Random();

    public void startGame() {
        player = new Player();
        System.out.println("Игровое поле: ");
        for (int i = 0; i < field.length; i++) {
            field[i] = " | ";
            System.out.print(field[i]);
        }
        System.out.println();
        player.setField(field);
    }

    public void game() {
        field = player.getField();
        while (true) {
            player.playersMove();
            findTheWinnerPlayer();
            if (isWinnerFound() == true) {
                break;
            }
            computersMove();
            findTheWinnerСomputer();
            if (isWinnerFound() == true) {
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public void computersMove() {
        System.out.println("Ход компьютера: ");
        sumOfSticks = sumOfSticks();
        if (sumOfSticks == 1) {
            return;
        } else if (sumOfSticks == 3) {
            numberOfSticks = random.nextInt(1, 3);
            System.out.println("Компьютер убирает " + numberOfSticks + " палочку / палочки");
        } else if (sumOfSticks == 2) {
            numberOfSticks = 1;
            System.out.println("Компьютер убирает 1 палочку");
        } else if (sumOfSticks > 1) {
            numberOfSticks = random.nextInt(1, 4);
            System.out.println("Компьютер убирает " + numberOfSticks + " палочку / палочки");
        }
        for (int i = 0; i < numberOfSticks; i++) {
            int a = 0;
            if (field[i].equals(" | ")) {
                field[i] = " X ";
            } else if (field[i].equals(" X ")) {
                do {
                    a++;
                } while (field[i + a].equals(" X ") & i + a < 19);
                field[i + a] = " X ";
            }
        }
        printField();
        System.out.println();
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i]);
        }
    }

    public int sumOfSticks() {
        sumOfSticks = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i].equals(" | ")) {
                sumOfSticks++;
            }
        }
        return sumOfSticks;
    }

    private boolean isWinnerFound() {
        return winnerFound;
    }

    public void findTheWinnerPlayer() {
        sumOfSticks = sumOfSticks();
        if (sumOfSticks == 1) {
            winnerFound = true;
            System.out.println("Ты выиграл!");
        }
    }

    public void findTheWinnerСomputer() {
        sumOfSticks = sumOfSticks();
        if (sumOfSticks == 1) {
            winnerFound = true;
            System.out.println("Компьютер выиграл!");
        }
    }
}



