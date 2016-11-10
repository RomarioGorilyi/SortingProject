package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.numbersGeneration.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaReverseSort;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class DescendingGenerator extends NumbersGenerator{
    public DescendingGenerator() {
        super(new RandomGeneration(), new JavaReverseSort());
    }
}
