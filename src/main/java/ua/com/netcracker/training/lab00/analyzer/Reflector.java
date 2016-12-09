package ua.com.netcracker.training.lab00.analyzer;

import org.reflections.Reflections;
import ua.com.netcracker.training.lab00.annotation.Sorting;
import ua.com.netcracker.training.lab00.generator.NumbersGenerator;

import java.util.Set;

/**
 * @author Horilyi
 */
public class Reflector {

    private Reflections reflections;

    public Reflector() {
        reflections = new Reflections("ua.com.netcracker.training.lab00");
    }

    /**
     * Gets generators' classes.
     *
     * @return {@code Set} of classes that extends {@code NumbersGenerator} class
     */
    public Set<Class<? extends NumbersGenerator>> getGeneratorsClasses() {
        return reflections.getSubTypesOf(NumbersGenerator.class);
    }

    /**
     * Gets sorting classes.
     *
     * @return {@code Set} of classes that are annotated with {@code @Sorting} annotation
     */
    public Set<Class<?>> getSortingClasses() {
        return reflections.getTypesAnnotatedWith(Sorting.class);
    }
}
