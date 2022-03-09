package com.company;
// ****************************************************************************
//                 -- Array Search Algorithm Example --
//*****************************************************************************

public class Main {

    public static void main(String[] args) {
        int[] arraySmall = {34, 45, 5656, 454, 34, 34, 56, 434, 34, 34};
        int[] SortArray = {12, 34, 56, 67, 89, 90, 94, 123, 345, 567};
        int[] arrayrand = {123, 56, 34, 234, 45, 1223, 767, 54, 3, 345, 633, 56, 23, 35};
        int key = 34;
        //MaxNumberSearch(arraySmall);
        //bubbleSort(arrayrand);
        //int position = BinarSearch(SortArray, key);
        //System.out.println("Found Key " + key + " in position " + position);
    }
    static void MaxNumberSearch(int[] array){
        int maxim = 0;
        int maxinde = 0;
        int repalcements = 0;
        int comparisons = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > maxim){
                maxim = array[i];
                maxinde = i;
                repalcements++;
            }
            comparisons++;
        }
        /*
        System.out.println("Maximum element is " + maxim);
        System.out.println("Maximum index is " + maxinde);
        System.out.println("Replacements " + repalcements);
        System.out.println("Number of Comparisons " + comparisons);

         */
    }
    // ****************************************************************************
    //                 -- Binary Search Algorithm Example --
    //             We use Binary Search with already sorted Arrays
    //*****************************************************************************
    static int BinarSearch(int[] array, int key){
        int position = 0;
        int left = 0;
        int right = array.length-1;

        while (left <= right){
            int middle = (left + right)/2;
            if (array[middle] == key) {
                System.out.println("Key's found!");
                return middle;

            }
            if (array[middle] < key){
                System.out.println("Cut left half");
                left = middle + 1;
            }
            if (array[middle] > key){
                System.out.println("Cut right half");
                right = middle - 1;

            }
        }
        return -1;
    }

    // ****************************************************************************
    //                 -- Bubble Sort Algorithm Example --
    //*****************************************************************************

    static void bubbleSort(int[] array){
        int Comparisons = 0;
        int numSwaps = 0;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length -1; i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = array[i];
                    numSwaps++;
                    sorted = false;
                }
                Comparisons++;
            }
        }
//        System.out.println("Comparisons: " + Comparisons);
//        System.out.println("Swaps: " + numSwaps);
    }
}
