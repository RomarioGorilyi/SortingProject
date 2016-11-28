package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sorting;

/**
 * Created by Roman Horilyi on 24.11.2016.
 */
@Sorting(name = "No sort", type = "None")
public class NoSorting implements SortingBehavior {

    public NoSorting() {
    }

    @Override
    public void sort(int[] array) {
        // leave our array without any modifications
    }
}
