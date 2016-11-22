package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

import java.util.Arrays;

/**
 * @author Horilyi
 */
@Sortable(name = "Embedded Java Sorting", type = "ascending")
public class JavaSort implements SortingBehavior {

    /**
     * Sorts the specified array using {@link Arrays#sort(int[])}.
     */
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
