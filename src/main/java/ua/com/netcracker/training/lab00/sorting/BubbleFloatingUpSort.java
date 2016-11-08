package ua.com.netcracker.training.lab00.sorting;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class BubbleFloatingUpSort implements Sorting {
    @Override
    public int[] sort(int[] arrayToSort) {
        // In order not to modify the specified array that has to be sorted,
        // we create copy of it using System.arraycopy() method.
        int[] resultArray = new int[arrayToSort.length];
        System.arraycopy(arrayToSort, 0, resultArray, 0, arrayToSort.length);

        boolean swapped = false;
        int indexOfLastUnsortedElement = resultArray.length - 1;

        do {
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (resultArray[i] > resultArray[i + 1]) {
                    int tmp = resultArray[i];
                    resultArray[i] = resultArray[i + 1];
                    resultArray[i + 1] = tmp;
                    swapped = true;
                }
            }
            indexOfLastUnsortedElement--;
        } while (swapped && indexOfLastUnsortedElement > 0);

        return resultArray;
    }
}
