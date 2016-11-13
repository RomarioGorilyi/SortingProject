package ua.com.netcracker.training.lab00.sorting;

import java.util.Arrays;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class JavaReverseSort implements SortingBehavior {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);

        int arrSize = array.length;
        for (int i = 0; i < arrSize / 2; i++) {
            swap(array, i, arrSize - 1 - i);
        }
    }
}
