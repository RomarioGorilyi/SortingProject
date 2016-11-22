package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

/**
 * @author Horilyi
 */
public class AscendingGenerator extends NumbersGenerator {

    /**
     * Constructs a newly allocated {@code AscendingGenerator}
     * with the {@link ua.com.netcracker.training.lab00.generation.RandomGeneration RandomGeneration} generation behavior
     * and the {@link ua.com.netcracker.training.lab00.sorting.JavaSort JavaSort} sorting behavior.
     *
     * @see DescendingGenerator
     */
    public AscendingGenerator() {
        super(new RandomGeneration(), new JavaSort());
    }
}
