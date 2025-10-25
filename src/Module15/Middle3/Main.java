package Module15.Middle3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f0 = 1, f1 = 1, f2 = 2, s = 4;
        while (f2 <= m) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            s = s + f2;
        }
        s = s + f2;
        s = s - f2;
        System.out.println(s);
    }
}
