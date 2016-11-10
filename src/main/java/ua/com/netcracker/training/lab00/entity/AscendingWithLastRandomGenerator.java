package ua.com.netcracker.training.lab00.entity;

import ua.com.netcracker.training.lab00.numbersGeneration.RandomGeneration;
import ua.com.netcracker.training.lab00.sorting.JavaSort;

import java.security.SecureRandom;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class AscendingWithLastRandomGenerator extends NumbersGenerator {
    public AscendingWithLastRandomGenerator() {
        super(new RandomGeneration(), new JavaSort());
    }

    @Override
    public int[] generateNumbers(int length) {
        int[] result = super.generateNumbers(length);

        SecureRandom random = new SecureRandom();
        result[length - 1] = random.nextInt();

        return result;
    }
}
