package Module15.Middle4;

import java.util.Scanner;

public class Main {

    public static boolean calculation(int powerOfANumber) {
        if (powerOfANumber == 1) return true;
        if (powerOfANumber <= 0 || powerOfANumber % 2 != 0) return false;
        return calculation(powerOfANumber / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (calculation(scanner.nextInt())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
