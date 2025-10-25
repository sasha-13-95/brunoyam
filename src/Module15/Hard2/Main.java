package Module15.Hard2;

import java.util.Arrays;

public class Main {
    public static void mergeSort(int[] myArray) {
        if (myArray.length <= 1) return;
        int[] array1 = Arrays.copyOfRange(myArray, 0, myArray.length / 2);
        int[] array2 = Arrays.copyOfRange(myArray, myArray.length / 2, myArray.length);
        mergeSort(array1);
        mergeSort(array2);
        merge(myArray, array1, array2);
    }

    public static void merge(int[] myArray, int[] array1, int[] array2) {
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

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 67, 34, 4, 60, 11, 6, 90, 44, 30, 29, 1};
        mergeSort(myArray);
        System.out.println(Arrays.toString(myArray));

    }
}