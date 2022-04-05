import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class NonRepeatingValuesArray {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] result = addNonRepeatValues();
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(indexOfSameValue(result)));
    }

    public static int[] addNonRepeatValues() {
        Random random = new Random();
        int n = 10;
        int bound = 50;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int val = random.nextInt(bound);

            if (temp.contains(val)) {
                i--;
            } else {
                temp.add(val);
            }
        }
        temp.add(temp.get(random.nextInt(n)));
        Collections.shuffle(temp);
        return temp.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] indexOfSameValue(int[] list) {
        int[] result = new int[2];

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

/*    public static int[] shuffle() {
        return IntStream.iterate(0, i -> i + 1)
                .map(element -> random.nextInt(11))
                .distinct()
                .limit(11)
                .map(element -> element == 10 ? random.nextInt(10) : element)
                .toArray();

    }*/
    /*        Arrays.stream(addNonRepeatValues())
                        .sorted()
                                .forEach(System.out::println);
        Arrays.stream(shuffle())
                .forEach(System.out::println);*/
}
