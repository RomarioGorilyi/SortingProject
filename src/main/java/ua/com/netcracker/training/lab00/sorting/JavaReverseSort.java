package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

import java.util.Arrays;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * @author Horilyi
 */
@Sortable(name = "Embedded Java Sorting", type = "descending")
public class JavaReverseSort implements SortingBehavior {

    /**
     * Sorts the specified array in a descending order
     * using {@link Arrays#sort(int[])} and inverting this sorted array.
     */
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);

        int arrSize = array.length;
        for (int i = 0; i < arrSize / 2; i++) {
            swap(array, i, arrSize - 1 - i);
        }
    }
}
