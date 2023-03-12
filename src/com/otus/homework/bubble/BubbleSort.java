package com.otus.homework.bubble;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 9, 2, 7, 3, 6, 8};

        printArray(array);
       boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;

                }
            }
            printArray(array);
       }
    }

    private static void printArray(int[] arr) {
        //for (int i =0;i<arr.length;i++){
            System.out.println("Sorted array: "+ Arrays.toString(arr));
        }
    }


