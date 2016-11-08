package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.sorting.Util.makeArrayCopy;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class BubbleSinkingSort implements Sorting {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array

        boolean swapped = false;
        int indexOfFirstSortedElement = 0;

        do {
            for (int i = resultArray.length - 1; i > indexOfFirstSortedElement; i--) {
                if (resultArray[i] < resultArray[i - 1]) {
                    int tmp = resultArray[i - 1];
                    resultArray[i - 1] = resultArray[i];
                    resultArray[i] = tmp;
                    swapped = true;
                }
            }
            indexOfFirstSortedElement++;
        } while (swapped && indexOfFirstSortedElement < resultArray.length);

        return resultArray;
    }
}
