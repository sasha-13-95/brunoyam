package Module7.Hard1;

import java.util.Scanner;

public class Player {
    private String name;
    private String word;
    private static int wordLength;
    private char[] letters;
    private char[] playerField;
    private char enteredLetter;
    private int counter = 0;

    private Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    public void enterAWord() {
        System.out.println(name + ", веди слово: ");
        word = scan.nextLine();
        wordLength = word.length();
        letters = word.toCharArray();
    }


    public void moveOfPlayer() {
        System.out.println(name + ", попробуй угадать слово, введи одну букву!");
        enteredLetter = scan.next().charAt(0);
        counter++;
    }

    public void playerField() {
        playerField = new char[wordLength];
        System.out.println("Поле игрока " + name);
        for (int i = 0; i < playerField.length; i++) {
            playerField[i] = '*';
            System.out.print(playerField[i]);
        }
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public char getEnteredLetter() {
        return enteredLetter;
    }


    public char[] getPlayerField() {
        return playerField;
    }

    public char[] getLetters() {
        return letters;
    }

    public int getCounter() {
        return counter;
    }
}


