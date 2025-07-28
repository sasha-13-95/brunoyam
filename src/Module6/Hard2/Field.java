package Module6.Hard2;


import java.util.Random;

public class Field {
    private char[][] field;
    private int coordinateX;
    private int coordinateY;
    private int coordinate[] = new int[2];
    private boolean correctLocation;
    Random random = new Random();


    public Field() {
        field = new char[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '0';
            }
        }
    }

    public char[][] getField() {
        return field;
    }

    private void printComputerField() {
        System.out.println("Поле компьютера: ");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void creatingAComputerField() {
        creationOf4DeckShip();
        creationOf3DeckShip();
        creationOf2DeckShip();
        creationOf1DeckShip();
    }

    private int[] inputValidation(int coordinateX, int coordinateY) {
        boolean correctInput = false;
        while (!correctInput) {
            if (field[coordinateX][coordinateY] == '1') {
                coordinateX = random.nextInt(10);
                coordinateY = random.nextInt(10);
            } else {
                correctInput = true;
            }
        }
        coordinate[0] = coordinateX;
        coordinate[1] = coordinateY;
        return coordinate;
    }

    private void creationOf1DeckShip() {
        for (int i = 1; i <= 4; i++) {
            coordinateX = random.nextInt(10);
            coordinateY = random.nextInt(10);
            inputValidation(coordinateX, coordinateY);
            coordinateX = coordinate[0];
            coordinateY = coordinate[1];
            field[coordinateX][coordinateY] = '1';
            printComputerField();
        }
    }

    private void creationOf2DeckShip() {
        for (int i = 1; i <= 3; i++) {
            correctLocation = false;
            while (!correctLocation) {
                coordinateX = random.nextInt(10);
                coordinateY = random.nextInt(10);
                inputValidation(coordinateX, coordinateY);
                coordinateX = coordinate[0];
                coordinateY = coordinate[1];
                if (coordinateY < 9 & coordinateY + 1 <= 9) {
                    if (field[coordinateX][coordinateY + 1] != '1') {
                        field[coordinateX][coordinateY] = '1';
                        field[coordinateX][coordinateY + 1] = '1';
                        correctLocation = true;
                    }
                } else if (coordinateY == 9 & field[coordinateX][coordinateY - 1] != '1') {
                    field[coordinateX][coordinateY] = '1';
                    field[coordinateX][coordinateY - 1] = '1';
                    correctLocation = true;
                } else if (coordinateX < 9 & coordinateX + 1 <= 9) {
                    if (field[coordinateX + 1][coordinateY] != '1') {
                        field[coordinateX][coordinateY] = '1';
                        field[coordinateX + 1][coordinateY] = '1';
                        correctLocation = true;
                    }
                } else if (coordinateX == 9 & field[coordinateX - 1][coordinateY] != '1') {
                    field[coordinateX][coordinateY] = '1';
                    field[coordinateX - 1][coordinateY] = '1';
                    correctLocation = true;
                } else {
                    correctLocation = false;
                }
            }
            printComputerField();
        }
    }


    public void creationOf3DeckShip() {
        for (int i = 1; i <= 2; i++) {
            correctLocation = false;
            while (!correctLocation) {
                coordinateX = random.nextInt(10);
                coordinateY = random.nextInt(10);
                inputValidation(coordinateX, coordinateY);
                coordinateX = coordinate[0];
                coordinateY = coordinate[1];
                if (coordinateY < 8 & coordinateY + 1 <= 9 & coordinateY + 2 <= 9) {
                    if (field[coordinateX][coordinateY + 1] != '1' & field[coordinateX][coordinateY + 2] != '1') {
                        field[coordinateX][coordinateY] = '1';
                        field[coordinateX][coordinateY + 1] = '1';
                        field[coordinateX][coordinateY + 2] = '1';
                        correctLocation = true;
                    }
                } else if (coordinateY == 8 & field[coordinateX][coordinateY - 1] != '1' & field[coordinateX][coordinateY - 2] != '1') {
                    field[coordinateX][coordinateY] = '1';
                    field[coordinateX][coordinateY - 1] = '1';
                    field[coordinateX][coordinateY - 2] = '1';
                    correctLocation = true;
                } else if (coordinateX < 8 & coordinateX + 1 <= 9 & coordinateX + 2 <= 9) {
                    if (field[coordinateX + 1][coordinateY] != '1' & field[coordinateX + 2][coordinateY] != '1') {
                        field[coordinateX][coordinateY] = '1';
                        field[coordinateX + 1][coordinateY] = '1';
                        field[coordinateX + 2][coordinateY] = '1';
                        correctLocation = true;
                    }
                } else if (coordinateX == 8 & field[coordinateX - 1][coordinateY] != '1' & field[coordinateX - 2][coordinateY] != '1') {
                    field[coordinateX][coordinateY] = '1';
                    field[coordinateX - 1][coordinateY] = '1';
                    field[coordinateX - 2][coordinateY] = '1';
                    correctLocation = true;
                } else {
                    correctLocation = false;
                }
            }
            printComputerField();
        }

    }

    public void creationOf4DeckShip() {
        correctLocation = false;
        coordinateX = random.nextInt(10);
        coordinateY = random.nextInt(10);
        inputValidation(coordinateX, coordinateY);
        coordinateX = coordinate[0];
        coordinateY = coordinate[1];
        if (coordinateY < 7 & coordinateY + 1 <= 9 & coordinateY + 2 <= 9 & coordinateY + 3 <= 9) {
            if (field[coordinateX][coordinateY + 1] != '1' & field[coordinateX][coordinateY + 2] != '1' & field[coordinateX][coordinateY + 3] != '1') {
                field[coordinateX][coordinateY] = '1';
                field[coordinateX][coordinateY + 1] = '1';
                field[coordinateX][coordinateY + 2] = '1';
                field[coordinateX][coordinateY + 3] = '1';
                correctLocation = true;
            }
        } else if (coordinateY == 7 & field[coordinateX][coordinateY - 1] != '1' & field[coordinateX][coordinateY - 2] != '1' & field[coordinateX][coordinateY - 3] != '1') {
            field[coordinateX][coordinateY] = '1';
            field[coordinateX][coordinateY - 1] = '1';
            field[coordinateX][coordinateY - 2] = '1';
            field[coordinateX][coordinateY - 3] = '1';
            correctLocation = true;
        } else if (coordinateX < 8 & coordinateX + 1 <= 9 & coordinateX + 2 <= 9 & coordinateX + 3 <= 9) {
            if (field[coordinateX + 1][coordinateY] != '1' & field[coordinateX + 2][coordinateY] != '1' & field[coordinateX + 3][coordinateY] != '1') {
                field[coordinateX][coordinateY] = '1';
                field[coordinateX + 1][coordinateY] = '1';
                field[coordinateX + 2][coordinateY] = '1';
                field[coordinateX + 3][coordinateY] = '1';
                correctLocation = true;
            }
        } else if (coordinateX == 8 & field[coordinateX - 1][coordinateY] != '1' & field[coordinateX - 2][coordinateY] != '1' & field[coordinateX + 3][coordinateY] != '1') {
            field[coordinateX][coordinateY] = '1';
            field[coordinateX - 1][coordinateY] = '1';
            field[coordinateX - 2][coordinateY] = '1';
            field[coordinateX - 2][coordinateY] = '1';
            correctLocation = true;
        } else {
            correctLocation = false;

        }
        printComputerField();
    }
}



















