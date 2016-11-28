package ua.com.netcracker.training.lab00;

import org.junit.Test;
import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.generator.*;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

/**
 * @author Horilyi
 */
public class GeneratorTest {

    @Test
    public void testUnsortedGenerator() {
        NumbersGenerator generator = new UnsortedGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingGenerator() {
        NumbersGenerator generator = new AscendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testDescendingGenerator() {
        NumbersGenerator generator = new DescendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingWithLastRandomGenerator() {
        NumbersGenerator generator = new AscendingWithLastRandomGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
