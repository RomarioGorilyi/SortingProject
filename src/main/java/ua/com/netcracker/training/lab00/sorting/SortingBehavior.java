package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;

/**
 * Created by Roman Horilyi on 31.10.2016.
 */
@FunctionalInterface
public interface SortingBehavior {
    /**
     * Sorts the specified array.
     *
     * @param array array that has to be sorted
     * @return sorted specified array
     */
    void sort(int[] array);

    /**
     * Obtains sorted array from the specified array without any modifications of the specified one having copied it.
     *
     * @param array array that has to be sorted
     * @return sorted copy of the specified array
     */
    default int[] obtainSortedArray(int[] array) {
        int[] arrayCopy = makeArrayCopy(array);
        sort(arrayCopy);
        return arrayCopy;
    }
}
