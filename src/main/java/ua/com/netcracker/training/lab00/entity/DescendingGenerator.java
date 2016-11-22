package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaReverseSort;

/**
 * @author Horilyi
 */
public class DescendingGenerator extends NumbersGenerator {

    /**
     * Constructs a newly allocated {@code DescendingGenerator}
     * with the {@link ua.com.netcracker.training.lab00.generation.RandomGeneration RandomGeneration} generation behavior
     * and the {@link ua.com.netcracker.training.lab00.sorting.JavaReverseSort JavaReverseSort} sorting behavior.
     *
     * @see AscendingGenerator
     */
    public DescendingGenerator() {
        super(new RandomGeneration(), new JavaReverseSort());
    }
}
