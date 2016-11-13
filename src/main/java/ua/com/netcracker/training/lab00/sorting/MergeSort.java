package ua.com.netcracker.training.lab00.sorting;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class MergeSort implements SortingBehavior {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int delimiterIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, delimiterIndex);
            mergeSort(array, delimiterIndex + 1, rightIndex);
            merge(array, leftIndex, delimiterIndex, rightIndex);
        }
    }

    private void merge(int[] array, int leftIndex, int delimiterIndex, int rightIndex) {
        int sizeOfLeftSubArray = delimiterIndex - leftIndex + 2;   // increases size of left sub-array by 1 number
                                                                // that contains Integer.MAX_VALUE
                                                                // in order to avoid ArrayIndexOutOfBoundsException
                                                                // in case all numbers of the left sub-array are reached
        int[] leftSubArray = new int[sizeOfLeftSubArray];
        for (int i = 0; i < sizeOfLeftSubArray - 1; i++) {
            leftSubArray[i] = array[leftIndex + i];
        }
        leftSubArray[sizeOfLeftSubArray - 1] = Integer.MAX_VALUE;

        int sizeOfRightSubArray = rightIndex - delimiterIndex + 1; // similarly to the left sub-array
        int[] rightSubArray = new int[sizeOfRightSubArray];
        for (int i = 0; i < sizeOfRightSubArray - 1; i++) {
            rightSubArray[i] = array[delimiterIndex + 1 + i];
        }
        rightSubArray[sizeOfRightSubArray - 1] = Integer.MAX_VALUE;

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        for (int i = leftIndex; i < rightIndex + 1; i++) {
            if (leftSubArray[leftArrayIndex] <= rightSubArray[rightArrayIndex]) {
                array[i] = leftSubArray[leftArrayIndex++];
            } else {
                array[i] = rightSubArray[rightArrayIndex++];
            }
        }
    }
}
