package Module6.Middle3;

import java.util.Scanner;

public class Player {

    private int numberOfSticks;

    private String[] field;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        String name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }
    public String[] getField() {
        return field;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    public void playersMove() {
        do {
            System.out.println("Убери от 1 до 3 палочек. Сколько палочек убрать?");
            numberOfSticks = scan.nextInt();
            if (numberOfSticks < 1 || numberOfSticks > 3) {
                System.out.println("Некорректный ввод");
            }
        } while (numberOfSticks < 1 || numberOfSticks > 3);
        for (int i = 0; i < numberOfSticks; i++) {
            if (field[i].equals(" | ")) {
                field[i] = " X ";
            } else if (field[i].equals(" X ")) {
                int a = 0;
                do {
                    a++;
                } while (field[i + a].equals(" X ") & i + a < 19);
                field[i + a] = " X ";
            }
        }
        System.out.println("Твой ход: ");
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i]);
        }
        System.out.println();
    }
}


