package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

/**
 * @author Horilyi
 */
public abstract class NumbersGenerator {

    private NumbersGenerationBehavior generationBehavior;
    private SortingBehavior sortingBehavior;

    /**
     * Constructs a newly allocated {@code NumbersGenerator}
     * with the specified generation behavior and the specified sorting Behavior.
     *
     * @param generationBehavior the NumbersGenerationBehavior implementation
     * @param sortingBehavior the SortingBehavior implementation
     */
    public NumbersGenerator(NumbersGenerationBehavior generationBehavior, SortingBehavior sortingBehavior) {
        this.generationBehavior = generationBehavior;
        this.sortingBehavior = sortingBehavior;
    }

    public NumbersGenerationBehavior getGenerationBehavior() {
        return generationBehavior;
    }

    public SortingBehavior getSortingBehavior() {
        return sortingBehavior;
    }

    public abstract int[] generateNumbers(int quantity);
}
