package Module6.Hard1;


public class DeckOfCards {
    private int[] deck;

    public int[] getDeck() {
        return deck;
    }

    public DeckOfCards() {
        deck = new int[36];
        for (int i = 0; i < 4; i++) {
            deck[i] = 6;
        }
        for (int i = 4; i >= 4 & i < 8; i++) {
            deck[i] = 7;
        }
        for (int i = 8; i >= 8 & i < 12; i++) {
            deck[i] = 8;
        }
        for (int i = 12; i >= 12 & i < 16; i++) {
            deck[i] = 9;
        }
        for (int i = 16; i >= 16 & i < 32; i++) {
            deck[i] = 10;
        }
        for (int i = 32; i >= 32 & i < 36; i++) {
            deck[i] = 11;
        }
    }
}
