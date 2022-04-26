import java.sql.Array;
import java.util.Arrays;

public class SequenceOfNumbers {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 2, 8};
        int[] array2 = new int[]{1, 4, 8, 2, 4};
        System.out.println(sequenceOfNum(array2));

    }

    public static Boolean sequenceOfNum(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] == 1) {
                count++;
            }
        }

        return count >= 3;
    }
}