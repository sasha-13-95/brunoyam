package Module7.Middle4;

import java.util.Random;

public class Frog {
    private int jumpCount = 0;
    private int numberOfJumps;
    private Random random = new Random();

    private void countJumps(int numberOfJumps) {
        jumpCount = jumpCount + numberOfJumps;
    }

    public void jump() {
        numberOfJumps = random.nextInt(1, 7);
        System.out.println(" , твой ход. Твоя лягушка сделает " + numberOfJumps + " прыжков");
        countJumps(numberOfJumps);
    }

    public int getJumpCount() {
        return jumpCount;
    }
}
