import java.util.Arrays;

public class WordCountSeparator {
    public static void main(String[] args) {
        System.out.println(wordCountSeparator("hello", ".", 7));

    }

    public static String wordCountSeparator(String word, String separator, int count) {
        String[] wordArray = new String[count];
        Arrays.fill(wordArray, word);
        return String.join(separator, wordArray);
    }
}
