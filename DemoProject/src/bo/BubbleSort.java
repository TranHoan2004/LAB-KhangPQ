/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.ArrayUtils;

/**
 *
 * @author khang
 */
public class BubbleSort {

    private int arr[];
    private int array[];

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    private int[] sort(boolean sortOnOriginArr, boolean isAsc) {
        array = arr;
        if (!sortOnOriginArr) {
            array = ArrayUtils.cloneArray(arr);
        }
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (isAsc) {
                    if (array[i] > array[i + 1]) {
                        ArrayUtils.swap(array, i, i + 1);
                        swapped = true;
                    }
                } else {
                    if (array[i] < array[i + 1]) {
                        ArrayUtils.swap(array, i, i + 1);
                        swapped = true;
                    }
                }
            }
        }
        return array;
    }

    public int[] getSortedArray(boolean isAsc) {
        return sort(false, isAsc);
    }
    
    public void printFoundIndex(int number) {
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                System.out.println("Found " + number + " at index: " + middle);
                return;
            } else if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("Not found");
    }

    public void displayCompare() {
        System.out.println("Original arr:");
        ArrayUtils.displayIntArray(arr);
        System.out.println("Ascending arr");
        ArrayUtils.displayIntArray(getSortedArray(true));
//        System.out.println("Descending arr");
//        ArrayUtils.displayIntArray(getSortedArray(false));
    }
    public void displayOr() {
        System.out.println("Original arr:");
        ArrayUtils.displayIntArray(arr);
    }
}
