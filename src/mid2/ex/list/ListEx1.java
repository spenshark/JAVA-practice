package mid2.ex.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int value : students) {
            arrayList.add(value);
        }

        int total = 0;
        for (Integer integer : arrayList) {
            total += integer;
        }
        double average = (double) total / arrayList.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
