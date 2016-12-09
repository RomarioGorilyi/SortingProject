package ua.com.netcracker.training.lab00;

import org.junit.Assert;
import org.junit.Test;
import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.generator.*;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

/**
 * @author Horilyi
 */
public class GeneratorTest {

    private static int expectedArraySize = 100;

    private boolean isArrayAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private boolean isArrayDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testUnsortedGeneratorKeepsSizeOfArray() {
        NumbersGenerator generator = new UnsortedGenerator(new RandomGeneration());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertEquals("Size of sorted array doesn't match the size of the unsorted one",
                expectedArraySize, numbers.length);
    }

    // Ascending generator:

    @Test
    public void testAscendingGeneratorKeepsSizeOfArray() {
        NumbersGenerator generator = new AscendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertEquals("Size of sorted array doesn't match the size of the unsorted one.",
                expectedArraySize, numbers.length);
    }

    @Test
    public void testAscendingGeneratorGeneratesAscendingArray() {
        NumbersGenerator generator = new AscendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertTrue("Sorted array doesn't have ascending order.", isArrayAscending(numbers));
    }

    // Descending generator:

    @Test
    public void testDescendingGeneratorKeepsSizeOfArray() {
        NumbersGenerator generator = new DescendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertEquals("Size of sorted array doesn't match the size of the unsorted one.",
                expectedArraySize, numbers.length);
    }

    @Test
    public void testDescendingGeneratorGeneratesDescendingArray() {
        NumbersGenerator generator = new DescendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertTrue("Sorted array doesn't have descending order.", isArrayDescending(numbers));
    }

    // Ascending generator with las random number:

    @Test
    public void testAscendingWithLastRandomKeepsSizeOfArray() {
        NumbersGenerator generator = new AscendingWithLastRandomGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        Assert.assertEquals("Size of sorted array doesn't match the size of the unsorted one.",
                expectedArraySize, numbers.length);
    }

    @Test
    public void testAscendingWithLastRandomGeneratesDescendingArray() {
        NumbersGenerator generator = new AscendingWithLastRandomGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(expectedArraySize);

        int[] ascendingNumbers = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            ascendingNumbers[i] = numbers[i];
        }

        Assert.assertTrue("Sorted array doesn't have ascending order.", isArrayAscending(ascendingNumbers));
    }
}
