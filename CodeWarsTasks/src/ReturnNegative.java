// In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(5));
        System.out.println(makeNegative(-2));
        System.out.println(makeNegative(0));
    }

    public static int makeNegative(final int x) {
        return (x >= 0) ? -1 * x : x;
    }
}
