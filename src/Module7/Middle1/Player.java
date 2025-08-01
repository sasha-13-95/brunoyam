package Module7.Middle1;

public class Player {
    private int winCounter = 0;

    public void increaseWinCounter() {
        System.out.println("Ты угадал, получи балл!");
        winCounter++;
    }

    public int getWinCounter() {
        return winCounter;
    }
}
