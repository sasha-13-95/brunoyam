package Module6.Hard2;

import java.util.Scanner;

import static Module6.Hard2.Game.fieldOfComputer;
import static Module6.Hard2.Game.printComputerField;

public class Player {
    private String name;
    Field field = new Field();
    private char[][] fieldOfPlayer = field.getField();
    private boolean successfulMove;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    public String getName() {
        return name;
    }

    public void printFieldOfPlayer() {
        System.out.println("Поле игрока: ");
        for (int i = 0; i < fieldOfPlayer.length; i++) {
            for (int j = 0; j < fieldOfPlayer.length; j++) {
                System.out.print(fieldOfPlayer[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void creatingAFieldOfPlayer() {
        int a;
        int b;
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.println("Введи координаты " + i + " однопалубного корабля");
                a = scan.nextInt();
                b = scan.nextInt();
                if (a < 0 || a > 10 || b < 0 || b > 10) {
                    System.out.println("Некорректные данные");
                }
            }
            while (a < 0 || a > 10 || b < 0 || b > 10);
            if (fieldOfPlayer[a][b] == '1') {
                do {
                    System.out.println("Ты уже вводил эти координаты, попробуй снова");
                    do {
                        a = scan.nextInt();
                        b = scan.nextInt();
                        if (a < 0 || a > 10 || b < 0 || b > 10) {
                            System.out.println("Некорректные данные");
                        }
                    }
                    while (a < 0 || a > 10 || b < 0 || b > 10);
                }
                while (fieldOfPlayer[a][b] == '1');
            }
            fieldOfPlayer[a][b] = '1';
            printFieldOfPlayer();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 2; j++) {
                do {
                    System.out.println("Введи координаты " + i + " двухпалубного корабля");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    if (a < 0 || a > 10 || b < 0 || b > 10) {
                        System.out.println("Некорректные данные");
                    }
                }
                while (a < 0 || a > 10 || b < 0 || b > 10);
                if (fieldOfPlayer[a][b] == '1') {
                    do {
                        System.out.println("Ты уже вводил эти координаты, попробуй снова");
                        do {
                            a = scan.nextInt();
                            b = scan.nextInt();
                            if (a < 0 || a > 10 || b < 0 || b > 10) {
                                System.out.println("Некорректные данные");
                            }
                        }
                        while (a < 0 || a > 10 || b < 0 || b > 10);
                    } while (fieldOfPlayer[a][b] == '1');
                }
                fieldOfPlayer[a][b] = '1';
                printFieldOfPlayer();
            }
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Введи координаты " + i + " трёхпалубного корабля");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    if (a < 0 || a > 10 || b < 0 || b > 10) {
                        System.out.println("Некорректные данные");
                    }
                }
                while (a < 0 || a > 10 || b < 0 || b > 10);
                if (fieldOfPlayer[a][b] == '1') {
                    do {
                        System.out.println("Ты уже вводил эти координаты, попробуй снова");
                        do {
                            a = scan.nextInt();
                            b = scan.nextInt();
                            if (a < 0 || a > 10 || b < 0 || b > 10) {
                                System.out.println("Некорректные данные");
                            }
                        }
                        while (a < 0 || a > 10 || b < 0 || b > 10);
                    } while (fieldOfPlayer[a][b] == '1');
                }
                fieldOfPlayer[a][b] = '1';
                printFieldOfPlayer();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Введи координаты четырёхпалубного корабля");
            do {
                a = scan.nextInt();
                b = scan.nextInt();
                if (a < 0 || a > 10 || b < 0 || b > 10) {
                    System.out.println("Некорректные данные");
                }
            }
            while (a < 0 || a > 10 || b < 0 || b > 10);
            if (fieldOfPlayer[a][b] == '1') {
                do {
                    System.out.println("Ты уже вводил эти координаты, попробуй снова");
                    do {
                        a = scan.nextInt();
                        b = scan.nextInt();
                        if (a < 0 || a > 10 || b < 0 || b > 10) {
                            System.out.println("Некорректные данные");
                        }
                    }
                    while (a < 0 || a > 10 || b < 0 || b > 10);
                } while (fieldOfPlayer[a][b] == '1');
            }
            fieldOfPlayer[a][b] = '1';
            printFieldOfPlayer();
        }
    }


    public void moveOfPlayer() {
        int a;
        int b;
        do {
            System.out.println("Твой ход, потопи корабли противника! Введи координаты (от 0 до 9):");
            a = scan.nextInt();
            b = scan.nextInt();
            if (a < 0 || a > 10 || b < 0 || b > 10) {
                System.out.println("Некорректные данные");
            }
            while (a < 0 || a > 10 || b < 0 || b > 10) ;
            if (fieldOfComputer[a][b] == '*' || fieldOfComputer[a][b] == '2') {
                do {
                    System.out.println("Ты уже стрелял по этим координатам, попробуй снова");
                    do {
                        a = scan.nextInt();
                        b = scan.nextInt();
                        if (a < 0 || a > 10 || b < 0 || b > 10) {
                            System.out.println("Некорректные данные");
                        }
                    }
                    while (a < 0 || a > 10 || b < 0 || b > 10);
                } while (fieldOfComputer[a][b] == '*' || fieldOfComputer[a][b] == '2');
            }
            if (fieldOfComputer[a][b] == '1') {
                fieldOfComputer[a][b] = '2';
                System.out.println("Корабль подбит!");
                successfulMove = true;
            } else {
                fieldOfComputer[a][b] = '*';
                System.out.println("Мимо!");
                successfulMove = false;
            }
            printComputerField();
            int sum = 0;
            for (int i = 0; i < fieldOfComputer.length; i++) {
                for (int j = 0; j < fieldOfComputer.length; j++) {
                    if (fieldOfComputer[i][j] == '2') {
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


    public char[][] getFieldOfPlayer() {
        return fieldOfPlayer;
    }
}

