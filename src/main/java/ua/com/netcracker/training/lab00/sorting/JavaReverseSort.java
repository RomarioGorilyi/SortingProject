package ua.com.netcracker.training.lab00.sorting;

import java.util.Arrays;

import static ua.com.netcracker.training.lab00.util.ArrayUtil.makeArrayCopy;
import static ua.com.netcracker.training.lab00.util.ArrayUtil.swap;

/**
 * Created by Roman Horilyi on 10.11.2016.
 */
public class JavaReverseSort implements SortingBehavior {
    @Override
    public int[] sort(int[] arrayToSort) {
        int[] resultArray = makeArrayCopy(arrayToSort); // in order not to modify the specified array
        Arrays.sort(resultArray);

        int arrSize = resultArray.length;
        for (int i = 0; i < arrSize / 2; i++) {
            swap(resultArray, i, arrSize - 1 - i);
        }

        return resultArray;
    }
}
