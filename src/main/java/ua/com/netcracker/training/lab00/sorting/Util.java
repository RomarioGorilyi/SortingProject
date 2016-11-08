package ua.com.netcracker.training.lab00.sorting;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class Util {
    public static int[] makeArrayCopy(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);
        return resultArray;
    }
}
