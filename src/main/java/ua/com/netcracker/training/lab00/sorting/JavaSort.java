package ua.com.netcracker.training.lab00.sorting;

import java.util.Arrays;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class JavaSort implements SortingBehavior {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array
        Arrays.sort(resultArray);
        return resultArray;
    }
}
