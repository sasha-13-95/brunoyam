package Module7.Middle4;

public class Game {
    private Player player1 = new Player();
    private Player player2 = new Player();
    private int jumpCount = 0;
    private static final int MAX_NUMBER_OF_JUMPS = 30;

    public void startGame() {
        while (jumpCount < MAX_NUMBER_OF_JUMPS) {
            player1.moveOfPlayer();
            jumpCount = player1.getJumpCount();
            if (jumpCount >= MAX_NUMBER_OF_JUMPS) {
                System.out.println(player1.getName() + " выиграл!");
                break;
            }
            player2.moveOfPlayer();
            jumpCount = player2.getJumpCount();
            if (jumpCount >= MAX_NUMBER_OF_JUMPS) {
                System.out.println(player2.getName() + " выиграл!");
                break;
            }
        }
    }
}
