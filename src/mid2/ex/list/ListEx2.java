package mid2.ex.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int num = sc.nextInt();
        while (num != 0){
            list.add(num);
            num = sc.nextInt();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size()-1) {
                System.out.print(", ");
            }
        }
    }
}
