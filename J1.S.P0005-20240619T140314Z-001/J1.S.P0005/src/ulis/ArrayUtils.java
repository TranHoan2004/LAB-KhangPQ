package ulis;

public class ArrayUtils {

    public static void displayIntArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] sort(int[] arr, boolean sortOnOriginArr, boolean isAsc) {
        int array[] = arr.clone();
        if (!sortOnOriginArr) {
            array = ulis.ArrayUtils.cloneArray(arr);
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
                        ulis.ArrayUtils.swap(array, i, i + 1);
                        swapped = true;
                    }
                } else {
                    if (array[i] < array[i + 1]) {
                        ulis.ArrayUtils.swap(array, i, i + 1);
                        swapped = true;
                    }
                }
            }
        }
        return array;
    }

    public static int[] randomIntArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = NumberUtils.getRandomNumberInRange(min, max);
        }
        return array;
    }

    public static void swap(int array[], int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    //coppy array
    public static int[] cloneArray(int arr[]) {
        int[] copiedArray = arr.clone();
        return copiedArray;
    }

}
