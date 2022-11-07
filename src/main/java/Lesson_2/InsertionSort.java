package Lesson_2;

import java.util.Arrays;

public class InsertionSort {

    public static void algSort(int[] myArray) {
        int k;
        for (int i = 1; i < myArray.length; i++) {
            int swapValue = myArray[i];
            for (k = i; k > 0 && swapValue < myArray[k - 1]; k--) {
                myArray[k] = myArray[k - 1];
            }
            myArray[k] = swapValue;
        }
    }

    public static void main(String[] args) {
        int[] mainArray = {1, 2, 10, 3, 1, 2, 5, 20, 4, 12, 7};
        System.out.println(Arrays.toString(mainArray));
        algSort(mainArray);
        System.out.println(Arrays.toString(mainArray));
    }
}
