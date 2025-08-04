package Module7.Middle1;

import java.util.Random;

public class Thimble {

    public int showNumberThimble() {
        Random random = new Random();
        int[] thimble = new int[3];
        thimble[0] = 1;
        thimble[1] = 2;
        thimble[2] = 3;
        int thimblesNumber = random.nextInt(thimble.length);
        System.out.println("Компьютер прячет монетку в " + thimble[thimblesNumber] + " наперстке!");
        return thimble[thimblesNumber];
    }
}
