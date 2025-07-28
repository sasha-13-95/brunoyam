package Module6.Hard2;

import java.util.Scanner;

import static Module6.Hard2.Game.*;

public class Player {
    private String name;
    private Field field1 = new Field();
    private Field field2 = new Field();
    private char[][] fieldOfPlayer = field1.getField();
    private char[][] computerField = field2.getField();

    private int coordinateX = 0;
    private int coordinateY = 0;
    private int coordinate[] = new int[2];


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

    private void printComputerField() {
        System.out.println("Поле компьютера: ");
        for (int i = 0; i < computerField.length; i++) {
            for (int j = 0; j < computerField.length; j++) {
                System.out.print(computerField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[] correctInput(int coordinateX, int coordinateY) {
        boolean correctInput = false;
        while (!correctInput) {
            if (coordinateX < 0 || coordinateX > 10 || coordinateY < 0 || coordinateY > 10) {
                System.out.println("Некорректные данные, попробуй еще раз");
                coordinateX = scan.nextInt();
                coordinateY = scan.nextInt();
            } else {
                correctInput = true;
            }
        }
        coordinate[0] = coordinateX;
        coordinate[1] = coordinateY;
        return coordinate;
    }


    public void creatingAFieldOfPlayer() {
        boolean correctLocation;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Введи координаты " + i + " однопалубного корабля");
            coordinateX = scan.nextInt();
            coordinateY = scan.nextInt();
            correctInput(coordinateX, coordinateY);
            coordinateX = coordinate[0];
            coordinateY = coordinate[1];
            correctLocation = false;
            while (!correctLocation) {
                if (fieldOfPlayer[coordinateX][coordinateY] == '1') {
                    System.out.println("Ты уже вводил эти координаты, попробуй снова");
                    coordinateX = scan.nextInt();
                    coordinateY = scan.nextInt();
                    correctInput(coordinateX, coordinateY);
                    coordinateX = coordinate[0];
                    coordinateY = coordinate[1];
                } else {
                    correctLocation = true;
                }
            }
            fieldOfPlayer[coordinateX][coordinateY] = '1';
            printFieldOfPlayer();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Введи координаты " + i + " двухпалубного корабля");
                coordinateX = scan.nextInt();
                coordinateY = scan.nextInt();
                correctInput(coordinateX, coordinateY);
                coordinateX = coordinate[0];
                coordinateY = coordinate[1];
                correctLocation = false;
                while (!correctLocation) {
                    if (fieldOfPlayer[coordinateX][coordinateY] == '1') {
                        System.out.println("Ты уже вводил эти координаты, попробуй снова");
                        coordinateX = scan.nextInt();
                        coordinateY = scan.nextInt();
                        correctInput(coordinateX, coordinateY);
                        coordinateX = coordinate[0];
                        coordinateY = coordinate[1];
                    } else {
                        correctLocation = true;
                    }
                }
                fieldOfPlayer[coordinateX][coordinateY] = '1';
            }
            printFieldOfPlayer();
        }


        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Введи координаты " + i + " трехпалубного корабля");
                coordinateX = scan.nextInt();
                coordinateY = scan.nextInt();
                correctInput(coordinateX, coordinateY);
                coordinateX = coordinate[0];
                coordinateY = coordinate[1];
                correctLocation = false;
                while (!correctLocation) {
                    if (fieldOfPlayer[coordinateX][coordinateY] == '1') {
                        System.out.println("Ты уже вводил эти координаты, попробуй снова");
                        coordinateX = scan.nextInt();
                        coordinateY = scan.nextInt();
                        correctInput(coordinateX, coordinateY);
                        coordinateX = coordinate[0];
                        coordinateY = coordinate[1];
                    } else {
                        correctLocation = true;
                    }
                }
                fieldOfPlayer[coordinateX][coordinateY] = '1';
            }
            printFieldOfPlayer();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Введи координаты четырёхпалубного корабля");
            coordinateX = scan.nextInt();
            coordinateY = scan.nextInt();
            correctInput(coordinateX, coordinateY);
            coordinateX = coordinate[0];
            coordinateY = coordinate[1];
            correctLocation = false;
            while (!correctLocation) {
                if (fieldOfPlayer[coordinateX][coordinateY] == '1') {
                    System.out.println("Ты уже вводил эти координаты, попробуй снова");
                    coordinateX = scan.nextInt();
                    coordinateY = scan.nextInt();
                    correctInput(coordinateX, coordinateY);
                    coordinateX = coordinate[0];
                    coordinateY = coordinate[1];
                } else {
                    correctLocation = true;
                }
            }
            fieldOfPlayer[coordinateX][coordinateY] = '1';
        }
        printFieldOfPlayer();
    }


    public void moveOfPlayer() {
        boolean correctIntroduction;
        boolean successfulMove = true;
        while (successfulMove) {
            System.out.println("Твой ход, потопи корабли противника! Введи координаты (от 0 до 9):");
            coordinateX = scan.nextInt();
            coordinateY = scan.nextInt();
            correctInput(coordinateX, coordinateY);
            coordinateX = coordinate[0];
            coordinateY = coordinate[1];
            correctIntroduction = false;
            while (!correctIntroduction) {
                if (fieldOfComputer[coordinateX][coordinateY] == '*' || fieldOfComputer[coordinateX][coordinateY] == '2') {
                    System.out.println("Ты уже стрелял по этим координатам, попробуй снова");
                    coordinateX = scan.nextInt();
                    coordinateY = scan.nextInt();
                    correctInput(coordinateX, coordinateY);
                    coordinateX = coordinate[0];
                    coordinateY = coordinate[1];
                } else {
                    correctIntroduction = true;
                }
            }
            if (fieldOfComputer[coordinateX][coordinateY] == '1') {
                fieldOfComputer[coordinateX][coordinateY] = '2';
                computerField[coordinateX][coordinateY] = '2';
                System.out.println("Корабль подбит!");
            } else {
                fieldOfComputer[coordinateX][coordinateY] = '*';
                computerField[coordinateX][coordinateY] = '*';
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
    }

    public char[][] getFieldOfPlayer() {
        return fieldOfPlayer;
    }
}

