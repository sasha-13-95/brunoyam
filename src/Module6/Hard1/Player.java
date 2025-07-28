package Module6.Hard1;

import java.util.Random;
import java.util.Scanner;

import static Module6.Hard1.Game.computerSum;


public class Player {

    private int card;
    private String name;
    private int playerSum;
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
        boolean correctInput = false;
        if (card == 11) {
            System.out.println("Сколько будет весить туз: 1 или 11?");
            int ace = scan.nextInt();
            while (!correctInput) {
                if (ace != 1 && ace != 11) {
                    System.out.println("Некорректное значение, попробуй снова");
                    ace = scan.nextInt();
                } else {
                    correctInput = true;
                }
            }
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


    public void otherMoveOfPlayer() {
        String action;
        boolean correctInput = false;
        System.out.println("Взять еще карту или сбросить? Введи <взять> или <сбросить>");
        action = scan.nextLine();
        while (!correctInput) {
            if (!action.equals("Взять") && !action.equals("взять") && !action.equals("Сбросить") && !action.equals("сбросить")) {
                System.out.println("Некорректное значение, попробуй снова");
                action = scan.nextLine();
            } else {
                correctInput = true;
            }
        }
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


    public int getPlayerSum() {
        return playerSum;
    }

    public int[] getDeck() {
        return deck;
    }
}