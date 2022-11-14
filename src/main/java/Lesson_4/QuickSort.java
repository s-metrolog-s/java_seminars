package Lesson_4;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 10, 3, 1, 2, 5, 20, 4, 12, 7};
        System.out.println(Arrays.toString(myArray));
        quickSort(myArray, 0, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));
    }
    private static void quickSort(int[] myArray, int begin, int end) {
        if (begin < end) {
            int mainIndex = partition(myArray, begin, end);
            quickSort(myArray, begin, mainIndex - 1);
            quickSort(myArray, mainIndex, end);
        }
    }

    private static int partition(int[] myArray, int begin, int end) {
        int leftIndex = begin;
        int rightIndex = end;
        int pivot = myArray[begin];

        while (leftIndex <= rightIndex) {

            while (myArray[leftIndex] < pivot) {
                leftIndex++;
            }

            while (myArray[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(myArray, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] myArray, int index1, int index2) {
        int tmp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = tmp;
    }

}