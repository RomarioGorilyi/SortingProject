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

    @Test
    public void testBubbleFloatingUpSort() {
        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testBubbleSinkingSort() {
        SortingBehavior sorting = new BubbleSinkingSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testMergeSort() {
        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testQuickSort() {
        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testJavaSort() {
        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);

        Assert.assertTrue(isArraySorted(sortedArray));
    }
}
