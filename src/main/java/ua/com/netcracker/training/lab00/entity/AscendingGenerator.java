package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.numbersGeneration.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class AscendingGenerator extends NumbersGenerator {
    public AscendingGenerator() {
        super(new RandomGeneration(), new JavaSort());
    }
}
