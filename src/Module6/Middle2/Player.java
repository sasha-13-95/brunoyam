package Module6.Middle2;

import java.util.Scanner;

public class Player {
    private char[][] field;
    private char myFigure;
    private char computerFigure;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        String name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);

    }

    public char getComputerFigure() {
        return computerFigure;
    }

    public void choosingAFigure() {
        do {
            System.out.println("Выбери, какой фигурой будешь играть: X или 0");
            myFigure = scan.next().charAt(0);
            if (myFigure != 88 & myFigure != 48) {
                System.out.println("Некорректный символ");
            }
        } while (myFigure != 88 && myFigure != 48);
        if (myFigure == 88) {
            computerFigure = '0';
        } else if (myFigure == 48) {
            computerFigure = 'X';
        }
    }

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }

    public void playersMove() {
        int a;
        int b;
        do {
            System.out.println("Твой ход. Введи координаты ячейки (от 0 до 2)");
            a = scan.nextInt();
            b = scan.nextInt();
            if (a < 0 || a >= field.length || b < 0 || b >= field.length) {
                System.out.println("Некорректные данные");
            }
        } while (a < 0 || a >= field.length || b < 0 || b >= field.length ||
                field[a][b] == myFigure || field[a][b] == computerFigure);
        field[a][b] = myFigure;
        System.out.println("Твой ход: ");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
