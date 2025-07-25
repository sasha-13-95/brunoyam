package Module6.Hard2;


public class Field {
    private char[][] field;

    public char[][] getField() {
        return field;
    }

    public Field() {
        field = new char[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '0';
            }
        }
    }

    public void creatingAComputerField() {
        field[0][0] = '1';
        field[0][1] = '1';
        field[0][3] = '1';
        field[0][6] = '1';
        field[0][7] = '1';
        field[0][8] = '1';
        field[0][9] = '1';
        field[1][3] = '1';
        field[2][3] = '1';
        field[2][9] = '1';
        field[4][1] = '1';
        field[5][1] = '1';
        field[5][6] = '1';
        field[6][1] = '1';
        field[8][3] = '1';
        field[8][5] = '1';
        field[8][8] = '1';
        field[9][0] = '1';
        field[9][8] = '1';
        field[3][9] = '1';
    }
}
