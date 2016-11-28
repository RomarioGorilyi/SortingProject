package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;

/**
 * @author Horilyi
 */
@FunctionalInterface
public interface SortingBehavior {

    /**
     * Sorts the specified array in the ascending order.
     *
     * @param array array that has to be sorted
     */
    void sort(int[] array);

    /**
     * Finds a sorted array from the specified array without any modifications of the specified one having copied it.
     *
     * @param array array that has to be sorted
     * @return sorted copy of the specified array
     */
    default int[] findSortedArray(int[] array) {
        int[] arrayCopy = makeArrayCopy(array);
        sort(arrayCopy);
        return arrayCopy;
    }
}
