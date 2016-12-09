package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * @author Horilyi
 */
@Sorting(name = "Bubble sort", type = "Exchanging")
public abstract class BubbleSort implements SortingBehavior {

    protected void sort(int[] array, int initialIndex, int indexOfUnsortedElement) {
        boolean swapped = false;

        do {
            for (int i = initialIndex; compare(i, indexOfUnsortedElement); i = shiftIndex(i)) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            indexOfUnsortedElement = shiftIndexOfUnsortedElement(indexOfUnsortedElement);
        } while (swapped && compare(initialIndex, indexOfUnsortedElement));
    }

    protected abstract boolean compare(int number1, int number2);

    protected abstract int shiftIndex(int index);

    protected abstract int shiftIndexOfUnsortedElement(int indexOfUnsortedElement);
}
