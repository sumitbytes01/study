package org.bytes.study.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 1, 17, 6, 2};
        int n = arr.length;
        selectionSort1(arr, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort1(int[] arr, int n) {
        //iterate
        for (int i = 0; i < n; i++) {
            //find min
            int minIdx = findMinIdx(arr, i);
            //swap
            swap(arr, minIdx, i);
        }
    }

    private static void swap(int[] arr, int minIdx, int i) {
        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    private static int findMinIdx(int[] arr, int i) {
        int minIdx = i;
        int j = i;
        for (; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) {
                minIdx = j;
            }
        }
    return minIdx; }
}
