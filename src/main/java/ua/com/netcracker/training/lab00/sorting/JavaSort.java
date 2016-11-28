package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sorting;

import java.util.Arrays;

/**
 * @author Horilyi
 */
@Sorting(name = "Embedded Java sort", type = "Exchanging")
public class JavaSort implements SortingBehavior {

    /**
     * Sorts the specified array using {@link Arrays#sort(int[])}.
     */
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
