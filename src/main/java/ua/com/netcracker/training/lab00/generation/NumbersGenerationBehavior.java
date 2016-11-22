package ua.com.netcracker.training.lab00.generation;

/**
 * @author Horilyi
 */
@FunctionalInterface
public interface NumbersGenerationBehavior {
    int[] generateNumbers(int quantity);
}
