package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

/**
 * @author Horilyi
 */
@Sortable(name = "No sorting", type = "none")
public class NoSorting implements SortingBehavior {

    /**
     * Doesn't sort the specified array.
     */
    @Override
    public void sort(int[] array) {
    }
}
