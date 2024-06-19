
package ui;
import bo.QuickSort;
import ulis.ArrayUtils;
import ulis.NumberUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Insertion Sort ======");
        //create length of array
        int arrLength = ulis.NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        //get element random Array
        int arr[] = ulis.ArrayUtils.randomIntArray(arrLength, 0, 500);
        //Create object
        QuickSort qs = new  QuickSort(arr);
        //Display original arr
        ArrayUtils.displayIntArray(arr);
        //Quick Sort
        System.out.println(qs.getQickSort());
    }
}
