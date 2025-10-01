package Module13.Easy1;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(-4));
    }

    private static double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Введено отрицательное число: " + a);
        } else {
            return Math.sqrt(a);
        }
    }
}
