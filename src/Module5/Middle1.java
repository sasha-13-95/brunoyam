package Module5;

public class Middle1 {
    public static void main(String[] args) {
        int[] arrayInt = {2, 1, 6, 9, 1, 45};
        int sum = 0;
        for (int x : arrayInt) {
            sum = sum + x;
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}
