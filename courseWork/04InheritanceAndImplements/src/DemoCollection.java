import java.util.*;

public class DemoCollection {

    public static String cleanString(String s) {
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static List<String> getWords(String inputFilename) {
        List<String> words = new ArrayList<String>();
        In in = new In(inputFilename);
        while (!in.isEmpty()) {
            String nextWord = cleanString(in.readString());
            words.add(nextWord);
            //System.out.println(nextWord);
        }
        return words;
    }

    public static int countUniqueWords(List<String> words) {
        Set<String> wordsSet = new HashSet<String>();
        // for (int i = 0; i < words.size(); i++) {
        //    String ithWord = words.get(i);
        //    wordsSet.add(ithWord);
        // }
        for (String ithword : words) {
            wordsSet.add(ithword);
        }
        return wordsSet.size();
    }

    public static Map<String, Integer> collectWordCount(List<String> words) {
        return null;
    }

    public static void main(String[] args) {
        List<String> w = getWords("test.txt");
        System.out.println(countUniqueWords(w));
    }
}
