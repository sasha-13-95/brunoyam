package Module7.Middle1;

import java.util.Random;

public class Thimble {
    public int showNumberThimble() {
        Random random = new Random();
        int number = random.nextInt(1, 4);
        System.out.println("Компьютер прячет монетку в " + number + " наперстке!");
        return number;
    }
}
