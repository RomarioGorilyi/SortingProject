package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;

/**
 * @author Horilyi
 */
@Sortable(name = "General Sorting Behavior", type = "none")
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
