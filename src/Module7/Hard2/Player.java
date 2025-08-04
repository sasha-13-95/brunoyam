package Module7.Hard2;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private static final int NUMBER_OF_CARDS = 4;
    private int card;
    private int[] playerCards = new int[NUMBER_OF_CARDS];
    private Scanner scan = new Scanner(System.in);
    private Random random = new Random();

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
    }

    private void cardsInHand() {
        for (int i = 0; i < playerCards.length; i++) {
            playerCards[i] = i;                           // 0 - камень, 1 - ножницы, 2 - бумага, 3- колодец
        }
    }

    public void moveOfPlayer() {
        cardsInHand();
        card = random.nextInt(4);
        switch (playerCards[card]) {
            case 0 -> System.out.println(name + " показал камень");
            case 1 -> System.out.println(name + " показал ножницы");
            case 2 -> System.out.println(name + " показал бумагу");
            case 3 -> System.out.println(name + " показал колодец");
        }
    }


    public int getPlayerCards(int card) {
        return playerCards[card];
    }

    public int getCard() {
        return card;
    }

    public String getName() {
        return name;
    }

}
