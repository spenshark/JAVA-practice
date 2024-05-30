package mid2.ex.collection.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> hashSet = new HashSet<>();
        for (Integer value : inputArr) {
            hashSet.add(value);
        }

        for (Integer value : hashSet) {
            System.out.println(value);
        }
    }
}
