package com.idan;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4, 7, 12, 1};

        for (int j = 2; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i > 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
