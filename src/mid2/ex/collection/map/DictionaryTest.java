package mid2.ex.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        inputWord(sc, map);

        System.out.println("\n==단어 검색 단계==");
        searchWord(sc, map);
    }

    private static void inputWord(Scanner sc, HashMap<String, String> map) {
        String input;
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            map.put(input, sc.nextLine());
        }
    }

    private static void searchWord(Scanner sc, HashMap<String, String> map) {
        String input;
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
            if (map.containsKey(input)) {
                System.out.println(input + "의 뜻: " + map.get(input));
            } else {
                System.out.println(input + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
