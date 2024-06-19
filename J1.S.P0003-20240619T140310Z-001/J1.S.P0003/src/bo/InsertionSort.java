package bo;

import ulis.ArrayUtils;

public class InsertionSort {

    private int[] arr;

    public InsertionSort() {
    }

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    private int[] insertionSort(boolean sortOnOriginArr,boolean isAsc) {
        int array[] = arr;
        if (!sortOnOriginArr) {
            array = ArrayUtils.cloneArray(arr);
        }
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
            while (isAsc ? j >= 0 && array[j] > key : j >= 0 && array[j] < key ) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public int[] getInsertionSort() {
        return insertionSort(false,false);
    }
}
//isAsc ? array[minElementIndex] > array[j] : array[minElementIndex] < array[j]