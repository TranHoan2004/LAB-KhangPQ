
package ui;

import bo.InsertionSort;
import ulis.ArrayUtils;


public class Main {

    public static void main(String[] args) {
        System.out.println("====== Insertion Sort ======");
        //create length of array
        int arrLength = ulis.NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        //get element random Array
        int arr[] = ulis.ArrayUtils.randomIntArray(arrLength, 0, 500);
        //Create object
        InsertionSort is = new InsertionSort(arr);
        //Display Original
        System.out.println("Original arr:");
        ArrayUtils.displayIntArray(arr);
        //Display Insertion sort
        System.out.println("Insertion Sort: ");
        ArrayUtils.displayIntArray(is.getInsertionSort());
    }
}
