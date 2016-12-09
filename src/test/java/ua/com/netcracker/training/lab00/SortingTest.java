package ua.com.netcracker.training.lab00;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import ua.com.netcracker.training.lab00.sorting.*;

import java.security.SecureRandom;

/**
 * @author Horilyi
 */
public class SortingTest {

    private static int[] unsortedArray;

    private boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @BeforeClass
    public static void generateUnsortedArray() {
        unsortedArray = new int[100];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 100; i++) {
            unsortedArray[i] = random.nextInt();
        }
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per method tested

    // Bubble floating up sort:

    @Test(expected = NullPointerException.class)
    public void testBubbleFloatingUpSortWithNull() {
        SortingBehavior sorting = new BubbleFloatingUpSort();
        sorting.findSortedArray(null);
    }

    @Test
    public void testBubbleFloatingUpSort() {
        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    // Bubble sinking sort:

    @Test(expected = NullPointerException.class)
    public void testBubbleSinkingSortWithNull() {
        SortingBehavior sorting = new BubbleSinkingSort();
        sorting.findSortedArray(null);
    }

    @Test
    public void testBubbleSinkingSort() {
        SortingBehavior sorting = new BubbleSinkingSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    // Merge sort:

    @Test(expected = NullPointerException.class)
    public void testMergeSortWithNull() {
        SortingBehavior sorting = new MergeSort();
        sorting.findSortedArray(null);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testMergeSort() {
        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    // Quick sort:

    @Test(expected = NullPointerException.class)
    public void testQuickSortWithNull() {
        SortingBehavior sorting = new MergeSort();
        sorting.findSortedArray(null);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testQuickSort() {
        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    // Java sort:

    @Test(expected = NullPointerException.class)
    public void testJavaSortWithNull() {
        SortingBehavior sorting = new JavaSort();
        sorting.findSortedArray(null);
    }

    @Test
    public void testJavaSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testJavaSort() {
        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }
}
