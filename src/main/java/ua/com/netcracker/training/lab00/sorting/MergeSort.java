package ua.com.netcracker.training.lab00.sorting;

import static ua.com.netcracker.training.lab00.sorting.Util.makeArrayCopy;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class MergeSort implements Sorting {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array
        mergeSort(resultArray, 0, resultArray.length - 1);

        return resultArray;
    }

    private void mergeSort(int[] arrayToSort, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int delimiterIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arrayToSort, leftIndex, delimiterIndex);
            mergeSort(arrayToSort, delimiterIndex + 1, rightIndex);
            merge(arrayToSort, leftIndex, delimiterIndex, rightIndex);
        }
    }

    private void merge(int[] arrayToSort, int leftIndex, int delimiterIndex, int rightIndex) {
        int sizeOfLeftArray = delimiterIndex - leftIndex + 2;   // increases size of left sub-array by 1 number
                                                                // that contains Integer.MAX_VALUE
                                                                // in order to avoid ArrayIndexOutOfBoundsException
                                                                // in case all numbers of the left sub-array are reached
        int[] leftArray = new int[sizeOfLeftArray];
        for (int i = 0; i < sizeOfLeftArray - 1; i++) {
            leftArray[i] = arrayToSort[leftIndex + i];
        }
        leftArray[sizeOfLeftArray - 1] = Integer.MAX_VALUE;

        int sizeOfRightArray = rightIndex - delimiterIndex + 1; // similarly to the left sub-array
        int[] rightArray = new int[sizeOfRightArray];
        for (int i = 0; i < sizeOfRightArray - 1; i++) {
            rightArray[i] = arrayToSort[delimiterIndex + 1 + i];
        }
        rightArray[sizeOfRightArray - 1] = Integer.MAX_VALUE;

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        for (int i = leftIndex; i < rightIndex + 1; i++) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                arrayToSort[i] = leftArray[leftArrayIndex++];
            } else {
                arrayToSort[i] = rightArray[rightArrayIndex++];
            }
        }
    }
}
