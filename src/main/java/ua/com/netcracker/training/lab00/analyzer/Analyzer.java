package ua.com.netcracker.training.lab00.analyzer;

import ua.com.netcracker.training.lab00.generation.NumbersGenerationBehavior;
import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.generator.NumbersGenerator;
import ua.com.netcracker.training.lab00.sorting.SortingBehavior;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author Horilyi
 */
public class Analyzer {

    /**
     * Analyzes performance of number generators with every sorting method.
     *
     * @param reflector {@code Reflector} instance which gets all relevant classes
     * @return {@code Map<NumberGenerator, Map<SortingBehavior, List<time of performance>>>}
     */
    public Map<String, Map<String, List<Long>>> analyzePerformance(Reflector reflector) {
        Map<String, Map<String, List<Long>>> resultStatistics = new HashMap<>();

        Set<Class<? extends NumbersGenerator>> generatorClasses = reflector.getGeneratorsClasses();

        for (Class<? extends NumbersGenerator> generatorClass : generatorClasses) {
            Set<Class<?>> sortingClasses = reflector.getSortingClasses();

            Map<String, List<Long>> generatorStatistics = new HashMap<>();
            for (Class<?> sortingClass : sortingClasses) {
                try {
                    NumbersGenerator generator = generatorClass.getConstructor(
                            NumbersGenerationBehavior.class,
                            SortingBehavior.class
                    ).newInstance(new RandomGeneration(), sortingClass.newInstance());

                    List<Long> sortingStatistics = new ArrayList<>();
                    for (int arraySize = 10; arraySize <= 100_000; arraySize *= 10) {
                        long startTime = System.nanoTime();
                        generator.generateNumbers(arraySize);
                        long endTime = System.nanoTime();

                        long duration = endTime - startTime;
                        sortingStatistics.add(duration);
                    }

                    generatorStatistics.put(sortingClass.getSimpleName(), sortingStatistics);

                } catch (NoSuchMethodException e) {
                    System.out.println("NoSuchMethod exception was caught!");
                } catch (IllegalAccessException e) {
                    System.out.println("IllegalAccess exception was caught!");
                } catch (InstantiationException e) {
                    System.out.println("Instantiation exception was caught!");
                } catch (InvocationTargetException e) {
                    System.out.println("InvocationTarget exception was caught!");
                }
            }

            resultStatistics.put(generatorClass.getSimpleName(), generatorStatistics);
        }

        return resultStatistics;
    }
}
