package org.bytes.study.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 1, 17, 6, 2};
        int n = arr.length;
        insertionSort(arr, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void insertionSort(int[] arr, int n) {
        // iterate
        for(int i = 1; i<n; i++){
            // keep elements in consideration in temp
            int temp = arr[i];
            //iterate on the sorted part until temp is less than the jth element
            int j = i-1;
            for(; j>=0 && arr[j] > temp; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }
            }
            // insert the temp at correct position
            arr[j+1] = temp;
        }
    }
}
