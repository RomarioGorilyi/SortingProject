package ua.com.netcracker.training.lab00;

/**
 * Created by Roman Horilyi on 09.11.2016.
 */
public class Util {
    public static int[] makeArrayCopy(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);
        return resultArray;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) {
            int tmp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = tmp;
        }
    }
}
