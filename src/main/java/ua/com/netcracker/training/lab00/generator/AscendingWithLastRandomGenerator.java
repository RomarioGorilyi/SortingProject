package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

import java.security.SecureRandom;

/**
 * @author Horilyi
 */
public class AscendingWithLastRandomGenerator extends NumbersGenerator {

    public AscendingWithLastRandomGenerator(NumbersGenerationBehavior generationBehavior,
                                            SortingBehavior sortingBehavior) {
        super(generationBehavior, sortingBehavior);
    }

    /**
     * Generates {@code quantity - 1} sorted numbers and the last random number.
     */
    @Override
    public int[] generateNumbers(int quantity) {
        int[] numbers = getGenerationBehavior().generateNumbers(quantity);
        int[] result = getSortingBehavior().findSortedArray(numbers);

        SecureRandom random = new SecureRandom();
        result[quantity - 1] = random.nextInt();

        return result;
    }
}
