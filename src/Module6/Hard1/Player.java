package Module6.Hard1;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private int card;
    private String name;
    private int playerSum;
    private int computerSum;
    DeckOfCards deckOfCards = new DeckOfCards();
    private int[] deck = deckOfCards.getDeck();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    public String getName() {
        return name;
    }

    private void selectAceValue() {
        if (card == 11) {
            int ace;
            do {
                System.out.println("Сколько будет весить туз: 1 или 11?");
                ace = scan.nextInt();
                if (ace != 1 && ace != 11) {
                    System.out.println("Некорректное значение");
                }
            } while (ace != 1 && ace != 11);
            if (ace == 1) {
                card = 1;
            }
        }
    }

    public void firstMoveOfPlayer() {
        playerSum = 0;
        int i = random.nextInt(36);
        card = deck[i];
        selectAceValue();
        playerSum += card;
        System.out.println("Игроку выпала карта: " + card);
        i = random.nextInt(36);
        card = deck[i];
        selectAceValue();
        playerSum += card;
        System.out.println("Игроку выпала карта: " + card + "\n Сумма карт = " + playerSum);
    }

    public void firstComputerMove() {
        computerSum = 0;
        int i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= 21 & card == 11) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card);
        i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= 21 & card == 11) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card + "\n Сумма карт = " + computerSum);
    }

    public void otherMoveOfPlayer() {
        String action;
        do {
            System.out.println("Взять еще карту или сбросить? Введи <взять> или <сбросить>");
            action = scan.nextLine();
            if (!action.equals("Взять") && !action.equals("взять") && !action.equals("Сбросить") && !action.equals("сбросить")) {
                System.out.println("Некорректное значение");
            }
        }
        while (!action.equals("Взять") && !action.equals("взять") && !action.equals("Сбросить") && !action.equals("сбросить"));
        if (action.equals("Взять") || action.equals("взять")) {
            int i = random.nextInt(36);
            card = deck[i];
            selectAceValue();
            playerSum += card;
            System.out.println("Игроку выпала карта: " + card);
        } else {
            playerSum = computerSum;
        }
    }

    public void otherComputerMove() {
        int i = random.nextInt(36);
        card = deck[i];
        if (computerSum + card >= 21 & card == 11) {
            card = 1;
        }
        computerSum += card;
        System.out.println("Дилеру выпала карта: " + card);
    }

    public int getPlayerSum() {
        return playerSum;
    }

    public int getComputerSum() {
        return computerSum;
    }

}