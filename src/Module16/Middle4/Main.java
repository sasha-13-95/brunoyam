package Module16.Middle4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 2, 4, 9, 1, 3, 5, 2, 9, 0};
        SortingMachine sortingMachine = new SortingMachine(new StrategyB());
        sortingMachine.sorted(array);
        System.out.println(Arrays.toString(array));
    }
}
