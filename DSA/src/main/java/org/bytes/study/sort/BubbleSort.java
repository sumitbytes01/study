package org.bytes.study.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 1, 17, 6, 2};
        int n = arr.length;
        bubbleSort(arr, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubbleSort(int[] arr, int n) {
        //iterate n times
        for (int k = 0; k < n; k++) {
            // iterate and swap
            boolean swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    swapped = true;
                }
            }
            // if there is no swap in an iteration, array is already sorted
            if(!swapped)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
