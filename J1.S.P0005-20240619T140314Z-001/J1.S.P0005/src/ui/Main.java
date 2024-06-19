/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import ulis.ArrayUtils;
import ulis.NumberUtils;
import bo.MergeSort;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("================= Merge Sort =================");
        //create length of array
        int arrLength = NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        //get element random Array
        int arr[] = ArrayUtils.randomIntArray(arrLength, 0, 500);
        //Create object
        MergeSort ms = new MergeSort(arr);
        //Display original array
        System.out.println("Original Array:");
        ArrayUtils.displayIntArray(arr);
        //Sort
        System.out.println("Merge Sort:");
        ArrayUtils.displayIntArray(ms.getMergeSort());
    }
}
