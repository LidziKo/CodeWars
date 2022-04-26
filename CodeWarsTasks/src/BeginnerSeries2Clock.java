// return count of ms after midnight

public class BeginnerSeries2Clock {
    public static void main(String[] args) {
        System.out.println(past(4, 56, 12));
        System.out.println(past(0, 43, 1));

    }

    public static int past(int h, int m, int s) {
        int hoursToMs = h * 3_600_000;
        int minToMs = m * 60_000;
        int secToMs = s * 1000;

        return hoursToMs + minToMs + secToMs;
        // return h * 3600000 + m * 60000 + s * 1000;
    }
}
