package ua.com.netcracker.training.lab00;

import org.junit.Assert;
import org.junit.Test;
import ua.com.netcracker.training.lab00.annotation.Sortable;
import ua.com.netcracker.training.lab00.entity.*;
import ua.com.netcracker.training.lab00.sorting.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author Horilyi
 */
public class TestSorting {
    @Test
    public void testBubbleFloatingUpSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

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
    public void testJavaSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testJavaReverseSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new JavaReverseSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {18, 15, 6, 5, 2, 0, -1};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testUnsortedGenerator() {
        NumbersGenerator generator = new UnsortedGenerator();
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingGenerator() {
        NumbersGenerator generator = new AscendingGenerator();
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testDescendingGenerator() {
        NumbersGenerator generator = new DescendingGenerator();
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingWithLastRandomGenerator() {
        NumbersGenerator generator = new AscendingWithLastRandomGenerator();
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testSortableAnnotation() {
        NumbersGenerator generator = new AscendingGenerator();
        Field[] fields = generator.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            Annotation[] annotations = field.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Sortable) {
                    Sortable myAnnotation = (Sortable) annotation;
                    System.out.println("name: " + myAnnotation.name());
                    System.out.println("type: " + myAnnotation.type());
                }
            }
        }
    }
}
