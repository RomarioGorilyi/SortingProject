package ua.com.netcracker.training.lab00.numbersGeneration;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
@FunctionalInterface
public interface NumbersGenerationBehavior {
    int[] generateNumbers(int quantity);
}
