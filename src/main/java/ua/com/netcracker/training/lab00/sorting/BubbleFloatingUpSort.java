package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.Util.makeArrayCopy;
import static ua.com.netcracker.training.lab00.Util.swap;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class BubbleFloatingUpSort implements Sorting {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array

        boolean swapped = false;
        int indexOfLastUnsortedElement = resultArray.length - 1;

        do {
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (resultArray[i] > resultArray[i + 1]) {
                    swap(resultArray, i, i + 1);
                    swapped = true;
                }
            }
            indexOfLastUnsortedElement--;
        } while (swapped && indexOfLastUnsortedElement > 0);

        return resultArray;
    }
}
