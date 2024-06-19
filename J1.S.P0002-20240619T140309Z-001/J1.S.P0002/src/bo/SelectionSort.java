package bo;

import ulis.ArrayUtils;

public class SelectionSort {

    private int arr[];

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    private int[] selectionSort(boolean isAsc, boolean sortOnOriginArr) {
        int array[] = arr;
        if (!sortOnOriginArr) {
            array = ArrayUtils.cloneArray(arr);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (isAsc ? array[minElementIndex] > array[j] : array[minElementIndex] < array[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                ArrayUtils.swap(array, i, minElementIndex);
            }
        }
        return array;
    }

    public int[] getSelectionSort() {
        return selectionSort(true, false);
    }
}
