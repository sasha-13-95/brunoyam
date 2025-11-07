package Module16.Middle4;

import java.util.Arrays;

public class StrategyB implements Strategy {
    @Override
    public void sorted(int[] array) {
        if (array.length <= 1) return;
        int[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] array2 = Arrays.copyOfRange(array, array.length / 2,
                array.length);
        sorted(array1);
        sorted(array2);
        merge(array, array1, array2);
    }

    private void merge(int[] myArray, int[] array1, int[] array2) {
        int index = 0, indexArray1 = 0, indexArray2 = 0;
        while (indexArray1 < array1.length && indexArray2 < array2.length) {
            if (array1[indexArray1] < array2[indexArray2]) {
                myArray[index] = array1[indexArray1];
                indexArray1++;
            } else {
                myArray[index] = array2[indexArray2];
                indexArray2++;
            }
            index++;
        }
        while (indexArray1 < array1.length) {
            myArray[index] = array1[indexArray1];
            indexArray1++;
            index++;
        }
        while (indexArray2 < array2.length) {
            myArray[index] = array2[indexArray2];
            indexArray2++;
            index++;
        }
    }
}
