package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

/**
 * @author Horilyi
 */
public class UnsortedGenerator extends NumbersGenerator {

    public UnsortedGenerator(NumbersGenerationBehavior generationBehavior,
                             SortingBehavior sortingBehavior) {
        super(generationBehavior, sortingBehavior);
    }

    @Override
    public int[] generateNumbers(int quantity) {
        return getGenerationBehavior().generateNumbers(quantity);
    }
}
