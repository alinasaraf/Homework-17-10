package com.otus.homework.bubble;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 9, 2, 7, 3, 6, 8};
        printArray(array);
        long sec1 = System.nanoTime();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;

                }
            }
        }
        long sec2 = System.nanoTime();
        printArray(array);
        //time: 196161
        //time: 1805
        //time: 2292
        System.out.println("time: "+ (sec2 - sec1));

        int[] array2 = new int[]{5, 10, 9, 2, 7, 3, 6, 8};
        long sec3 = System.nanoTime();
        Arrays.sort(array2);
        long sec4 = System.nanoTime();
        System.out.println("time2: "+ (sec4 - sec3));
       // time2: 796902
        //time2: 333199


    }

    private static void printArray(int[] arr) {
        //for (int i =0;i<arr.length;i++){
            System.out.println("Sorted array: "+ Arrays.toString(arr));
        }
    }


