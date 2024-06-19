
package ui;

import bo.SelectionSort;
import ulis.NumberUtils;
import ulis.ArrayUtils;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== Selection Sort ======");
        //create length of array
        int arrLength = ulis.NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        //get element random Array
        int arr[] = ulis.ArrayUtils.randomIntArray(arrLength, 0, 500);
        //Create object
        SelectionSort ss = new SelectionSort(arr);
        //Display Original
        System.out.println("Original arr:");
        ArrayUtils.displayIntArray(arr);
        //Display selection Sort
        System.out.println("Sort by selection sort:");
        ArrayUtils.displayIntArray(ss.getSelectionSort());
    }
}
