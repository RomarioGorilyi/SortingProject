package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.numbersGeneration.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public abstract class NumbersGenerator {
    private NumbersGenerationBehavior generationBehavior;
    private SortingBehavior sortingBehavior;

    public NumbersGenerator(NumbersGenerationBehavior generationBehavior, SortingBehavior sortingBehavior) {
        this.generationBehavior = generationBehavior;
        this.sortingBehavior = sortingBehavior;
    }

    public int[] generateNumbers(int length) {
        int[] numbers = generationBehavior.generateNumbers(length);
        return sortingBehavior.obtainSortedArray(numbers);
    }
}
