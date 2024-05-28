package mid2.ex.set;

import java.util.*;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Set<Integer> hashSet = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer value : hashSet) {
            System.out.println(value);
        }
    }
}
