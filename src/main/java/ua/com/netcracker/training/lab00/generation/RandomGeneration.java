package ua.com.netcracker.training.lab00.generation;

import java.security.SecureRandom;

/**
 * @author Horilyi
 */
public class RandomGeneration implements NumbersGenerationBehavior {

    /**
     * Generates an array of numbers with the specified length randomly.
     */
    @Override
    public int[] generateNumbers(int quantity) {
        int[] numbers = new int[quantity];

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < quantity; i++) {
            numbers[i] = random.nextInt();
        }

        return numbers;
    }
}
