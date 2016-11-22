package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * @author Horilyi
 */
@Sortable(name = "BubbleSort", type = "ascending & sinking")
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
