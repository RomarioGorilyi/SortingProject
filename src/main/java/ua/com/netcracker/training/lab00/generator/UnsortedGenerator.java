package ua.com.netcracker.training.lab00.generator;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;

/**
 * @author Horilyi
 */
public class UnsortedGenerator extends NumbersGenerator {

    public UnsortedGenerator(NumbersGenerationBehavior generationBehavior) {
        super(generationBehavior, null);
    }

    @Override
    public int[] generateNumbers(int quantity) {
        return getGenerationBehavior().generateNumbers(quantity);
    }
}
