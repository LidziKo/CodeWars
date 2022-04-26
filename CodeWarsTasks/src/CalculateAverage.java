/*Write a function which calculates the average of the numbers in a given list.
        Note: Empty arrays should return 0.*/

import java.util.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1};
        int[] array2 = new int[]{1, 2, 8};
        System.out.println(find_average(array2));
    }

    public static double find_average(int[] array) {
        double result = 0;
        for (int j : array) {
            result += j;
        }
        return result / array.length;
    }
}
