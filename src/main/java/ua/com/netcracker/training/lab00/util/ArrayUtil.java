package ua.com.netcracker.training.lab00.util;

/**
 * @author Horilyi
 */
public class ArrayUtil {
    public static int[] makeArrayCopy(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);
        return resultArray;
    }

    /**
     * Swaps 2 specified elements of the specified array.
     *
     * @param array array from which elements are swapped
     * @param firstIndex the first element to swap
     * @param secondIndex the second element to swap
     */
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) {
            int tmp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = tmp;
        }
    }
}
