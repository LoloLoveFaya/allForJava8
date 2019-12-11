package dubs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Scrable {
    static Map<String, Integer> letterScrable = new HashMap<>();

    static Function<String, Integer> scrableScore = word -> {
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            score = score + fillScrableConf().get(word.toUpperCase().split("")[i]);
        }
        return score;
    };

    static private Map<String, Integer> fillScrableConf() {
        letterScrable.put("A", 4);
        letterScrable.put("B", 5);
        letterScrable.put("C", 7);
        letterScrable.put("D", 0);
        return letterScrable;
    }

    public Integer getScore(String word) {
        Integer sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum + fillScrableConf().get(word.toUpperCase().split("")[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(getScore("AB"));
        System.out.println("je suis la ma mène " + scrableScore.apply("AB"));
    }

}

