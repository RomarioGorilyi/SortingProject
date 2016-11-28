package ua.com.netcracker.training.lab00;

import org.junit.Assert;
import org.junit.Test;
import ua.com.netcracker.training.lab00.sorting.*;

/**
 * @author Horilyi
 */
public class SortingTest {

    @Test
    public void testBubbleFloatingUpSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testBubbleFloatingUpSortWithAlreadySortedArray() {
        int[] unsortedArray = {-1, 0, 2, 5, 6, 15, 18};

        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testBubbleSinkingSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new BubbleSinkingSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testMergeSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testQuickSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
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
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testNoSorting() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new NoSorting();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {18, 5, -1, 0, 6, 2, 15};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }
}
