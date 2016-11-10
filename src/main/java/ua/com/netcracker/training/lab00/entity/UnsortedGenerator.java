package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.numbersGeneration.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.NoSorting;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class UnsortedGenerator extends NumbersGenerator{
    public UnsortedGenerator() {
        super(new RandomGeneration(), new NoSorting());
    }
}
