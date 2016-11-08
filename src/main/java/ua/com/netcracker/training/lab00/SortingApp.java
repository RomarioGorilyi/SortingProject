package ua.com.netcracker.training.lab00;

import ua.com.netcracker.training.lab00.sorting.BubbleFloatingUpSort;
import ua.com.netcracker.training.lab00.sorting.BubbleSinkingSort;
import ua.com.netcracker.training.lab00.sorting.MergeSort;
import ua.com.netcracker.training.lab00.sorting.Sorting;

/**
 * Created by Roman Horilyi on 01.11.2016.
 */
public class SortingApp {
    public static void main(String[] args) {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};
        System.out.println("Unsorted array:");
        printArray(unsortedArray);

        /*Sorting bubbleFloatingUpSorting = new BubbleFloatingUpSort();
        int[] sortedArray = bubbleFloatingUpSorting.sort(unsortedArray);
        System.out.println("\nSorted array: ");
        printArray(sortedArray);

        Sorting bubbleSinkingSorting = new BubbleSinkingSort();
        int[] sortedArray2 = bubbleSinkingSorting.sort(unsortedArray);*/

        Sorting mergeSort = new MergeSort();
        System.out.println("\nSorted array: ");
        printArray(mergeSort.sort(unsortedArray));
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
