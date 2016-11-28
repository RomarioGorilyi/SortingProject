package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * @author Horilyi
 */
public class DescendingGenerator extends NumbersGenerator {

    public DescendingGenerator(NumbersGenerationBehavior generationBehavior,
                               SortingBehavior sortingBehavior) {
        super(generationBehavior, sortingBehavior);
    }

    /**
     * Generate an array of numbers in the descending order with the specified quantity of elements.
     */
    @Override
    public int[] generateNumbers(int quantity) {
        int[] numbers = getGenerationBehavior().generateNumbers(quantity);
        int[] result =  getSortingBehavior().findSortedArray(numbers);

        int arrSize = result.length;
        for (int i = 0; i < arrSize / 2; i++) {
            swap(result, i, arrSize - 1 - i);
        }

        return result;
    }
}
