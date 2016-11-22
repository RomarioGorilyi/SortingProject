package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.NoSorting;

/**
 * @author Horilyi
 */
public class UnsortedGenerator extends NumbersGenerator {

    /**
     * Constructs a newly allocated {@code UnsortedGenerator}
     * with the {@link ua.com.netcracker.training.lab00.generation.RandomGeneration RandomGeneration} generation behavior
     * and the {@link ua.com.netcracker.training.lab00.sorting.NoSorting NoSorting} sorting behavior (doesn't sort these numbers).
     */
    public UnsortedGenerator() {
        super(new RandomGeneration(), new NoSorting());
    }
}
