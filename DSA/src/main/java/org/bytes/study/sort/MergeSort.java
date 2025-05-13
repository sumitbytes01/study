package org.bytes.study.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 1, 17, 6, 2};
        int n = arr.length - 1;
        int l = 0;
        mergeSort(arr, l, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid  = l+ (r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            mergeArr(arr, l, mid, r);
        }
    }

    private static void mergeArr(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid+1;
        int k = 0;
        int arrB[] = new int[r-l+1];

        while(i<=mid && j<= r){
            if(arr[i] < arr[j]){
                arrB[k] = arr[i];
                i++;
            }
            else{
                arrB[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arrB[k] = arr[i];
            i++;
            k++;
        }
        while(j<= r){
            arrB[k] = arr[j];
            j++;
            k++;
        }
        // ✅ Copy back to original array
        // l+p because l starts from 0 but may be any number at any given iteration.
        for (int p = 0; p < arrB.length; p++) {
            arr[l + p] = arrB[p];
        }
    }
}
