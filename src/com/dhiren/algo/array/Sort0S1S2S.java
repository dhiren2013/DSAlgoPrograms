package com.dhiren.algo.array;

/**
 * Created by dhirendra.thakur on 25/09/14.
 */
    public class Sort0S1S2S {

        public static void main(String[] args) {
            int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
            sortAnArrayOf0s1sAnd2s(arr);
        }

        private static void sortAnArrayOf0s1sAnd2s(int[] arr) {

            int start = 0, end = arr.length - 1, i = 0;

            while (i < arr.length && i <= end) {
                switch(arr[i]) {
                    case 0: swap(arr, start, i); start++; i++; break;
                    case 1: i++; break;
                    case 2: swap(arr, end, i); end--;
                }
            }
            for (int j : arr)
                System.out.print(j + " ");
        }

        private static void swap(int[] arr, int j, int i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

