package Lesson_1;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

    public static void heapSort (int[] myArray, int length) {
        int temp;
        int size = length-1;
        for (int i = (length / 2); i >= 0; i--) {
            makeHeap(myArray, i, size);
        };
        for(int i = size; i >= 0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            makeHeap(myArray, 0, size);
        }
        System.out.println(Arrays.toString(myArray));
    }
    public static void makeHeap(int[] myArray, int i, int heapSize) {
        int a = 2 * i + 1;
        int b = 2 * i + 2;
        int largestElement;
        if (a <= heapSize && myArray[a] > myArray[i]) {
            largestElement = a;
        } else {
            largestElement = i;
        }
        if (b <= heapSize && myArray[b] > myArray[largestElement]) {
            largestElement = b;
        }
        if (largestElement != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            makeHeap(myArray, largestElement, heapSize);
        }
    }

    public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();
            System.out.println("Введите элементы массива: ");
            int[] myArray = new int[size];
            for(int i = 0; i < size; i++) {
                myArray[i] = scanner.nextInt();
            }
            heapSort(myArray, size);
    }
}