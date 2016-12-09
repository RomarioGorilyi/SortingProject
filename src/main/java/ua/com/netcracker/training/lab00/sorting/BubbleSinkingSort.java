package ua.com.netcracker.training.lab00.sorting;

import ua.com.netcracker.training.lab00.annotation.Sorting;

/**
 * @author Horilyi
 */
@Sorting(name = "Bubble sinking sort", type = "Exchanging")
public class BubbleSinkingSort extends BubbleSort {

    @Override
    public void sort(int[] array) {
        super.sort(array, array.length - 2, 0);
    }


    @Override
    public boolean compare(int number1, int number2) {
        return number1 >= number2;
    }

    @Override
    public int shiftIndex(int index) {
        return index - 1;
    }

    @Override
    public int shiftIndexOfUnsortedElement(int indexOfUnsortedElement) {
        return indexOfUnsortedElement + 1;
    }
}
