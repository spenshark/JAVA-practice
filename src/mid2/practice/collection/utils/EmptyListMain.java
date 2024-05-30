package mid2.practice.collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        List<Integer> list = List.of(arr);

        arrList.set(0, 100);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
        System.out.println("list = " + list);
    }
}
