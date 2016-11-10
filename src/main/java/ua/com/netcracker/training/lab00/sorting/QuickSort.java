package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;
import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class QuickSort implements SortingBehavior {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array
        quickSort(resultArray, 0, resultArray.length - 1);
        return resultArray;
    }

    private void quickSort(int[] arrayToSort, int leftIndex, int rightIndex) {
        int index = partition(arrayToSort, leftIndex, rightIndex);
        if (leftIndex < index - 1) {
            quickSort(arrayToSort, leftIndex, index - 1);
        }
        if (rightIndex > index) {
            quickSort(arrayToSort, index, rightIndex);
        }
    }

    private int partition(int[] arrayToSort, int leftIndex, int rightIndex) {
        int pivot = arrayToSort[(leftIndex + rightIndex) / 2];

        while (leftIndex <= rightIndex) {
            while (arrayToSort[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arrayToSort[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arrayToSort, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }
}
