package ua.com.netcracker.training.lab00.sorting;

import java.util.Arrays;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class JavaSort implements SortingBehavior {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
