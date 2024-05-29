package mid2.ex.map;

import java.util.HashMap;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        HashMap<String, Integer> map = new HashMap<>();
        // ArrayList<String> list = new ArrayList<>(Arrays.stream(split).toList());

        String[] split = text.split(" ");

        for (String word : split) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
