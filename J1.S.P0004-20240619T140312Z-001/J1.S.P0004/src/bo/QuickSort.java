package bo;

import ulis.ArrayUtils;

public class QuickSort {

    private int arr[];
    private int array[];

    public QuickSort() {
    }

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    private int partition(int left, int right) {
        array = ArrayUtils.cloneArray(arr);
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                ArrayUtils.swap(array, i, j);
                i++;
                j--;
            }
        };
        return i;
    }

    private int quickSort(int left, int right) {
        int index = partition(left, right);
        if (left < index - 1) {
            return quickSort(left, index - 1);
        }
        if (index < right) {
            return quickSort(index, right);
        }
        return -1;
    }

    public int getQickSort() {
        int index = quickSort(0, array.length-1);
        return index;
    }
}
