package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sortable;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * @author Horilyi
 */
@Sortable(name = "BubbleSort", type = "ascending & floating up")
public class BubbleFloatingUpSort implements SortingBehavior {

    @Override
    public void sort(int[] array) {
        boolean swapped = false;
        int indexOfLastUnsortedElement = array.length - 1;

        do {
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            indexOfLastUnsortedElement--;
        } while (swapped && indexOfLastUnsortedElement > 0);
    }
}
