package ua.com.netcracker.training.lab00.numbersGeneration;

import java.security.SecureRandom;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class RandomGeneration implements NumbersGenerationBehavior {
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
