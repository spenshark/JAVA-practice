package mid2.ex.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(inputArr));

        for (Integer value : hashSet) {
            System.out.println(value);
        }
    }
}
