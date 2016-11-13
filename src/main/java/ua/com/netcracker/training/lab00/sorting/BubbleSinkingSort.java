package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class BubbleSinkingSort implements SortingBehavior {
    @Override
    public void sort(int[] array) {
        boolean swapped = false;
        int indexOfFirstSortedElement = 0;

        do {
            for (int i = array.length - 1; i > indexOfFirstSortedElement; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    swapped = true;
                }
            }
            indexOfFirstSortedElement++;
        } while (swapped && indexOfFirstSortedElement < array.length);
    }
}
