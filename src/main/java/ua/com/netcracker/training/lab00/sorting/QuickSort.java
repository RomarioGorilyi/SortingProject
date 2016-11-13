package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class QuickSort implements SortingBehavior {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int leftIndex, int rightIndex) {
        int index = partition(array, leftIndex, rightIndex);
        if (leftIndex < index - 1) {
            quickSort(array, leftIndex, index - 1);
        }
        if (rightIndex > index) {
            quickSort(array, index, rightIndex);
        }
    }

    private int partition(int[] array, int leftIndex, int rightIndex) {
        int pivot = array[(leftIndex + rightIndex) / 2];

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }
}
