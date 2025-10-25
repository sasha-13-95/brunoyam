package Module15.Middle2;

public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 0;
        result[2] = 1;
        for (int i = 3; i < result.length; i++) {
            result[i] = result[i - 3] + result[i - 2] + result[i - 1];
        }
        return result[n];
    }
}
