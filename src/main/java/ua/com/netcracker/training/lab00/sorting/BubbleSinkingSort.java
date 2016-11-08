package ua.com.netcracker.training.lab00.sorting;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class BubbleSinkingSort implements Sorting {
    @Override
    public int[] sort(int[] arrayToSort) {
        // In order not to modify the specified array that has to be sorted,
        // we create copy of it using System.arraycopy() method.
        int[] resultArray = new int[arrayToSort.length];
        System.arraycopy(arrayToSort, 0, resultArray, 0, arrayToSort.length);

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
