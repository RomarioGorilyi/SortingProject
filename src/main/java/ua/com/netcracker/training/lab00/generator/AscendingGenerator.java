package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

/**
 * @author Horilyi
 */
public class AscendingGenerator extends NumbersGenerator {

    public AscendingGenerator(NumbersGenerationBehavior generationBehavior,
                              SortingBehavior sortingBehavior) {
        super(generationBehavior, sortingBehavior);
    }

    /**
     * Generate an array of numbers in the ascending order with the specified quantity of elements.
     */
    @Override
    public int[] generateNumbers(int quantity) {
        int[] numbers = getGenerationBehavior().generateNumbers(quantity);
        return getSortingBehavior().findSortedArray(numbers);
    }
}
