package Module15.Easy1;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 2, 4, 9, 1, 3, 5, 2, 9, 0};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
