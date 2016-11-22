package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

import java.security.SecureRandom;

/**
 * @author Horilyi
 */
public class AscendingWithLastRandomGenerator extends NumbersGenerator {

    /**
     * Constructs a newly allocated {@code AscendingWithLastRandomGenerator}
     * with the {@link ua.com.netcracker.training.lab00.generation.RandomGeneration RandomGeneration} generation behavior
     * and the {@link ua.com.netcracker.training.lab00.sorting.JavaSort JavaSort} sorting behavior.
     *
     * @see AscendingGenerator
     */
    public AscendingWithLastRandomGenerator() {
        super(new RandomGeneration(), new JavaSort());
    }

    /**
     * Generates {@code quantity - 1} sorted numbers and the last random number.
     */
    @Override
    public int[] generateNumbers(int quantity) {
        int[] result = super.generateNumbers(quantity);

        SecureRandom random = new SecureRandom();
        result[quantity - 1] = random.nextInt();

        return result;
    }
}
