package mid2.ex.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        HashMap<String, Integer> map = new HashMap<>();
        // ArrayList<String> list = new ArrayList<>(Arrays.stream(split).toList());

        String[] split = text.split(" ");

        for (String s : split) {
            map.putIfAbsent(s, 0);
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
        }
/*
        for (String word : split) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }
*/

        System.out.println(map);
    }
}
