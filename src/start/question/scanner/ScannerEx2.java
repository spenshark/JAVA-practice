package start.question.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요:");
        int num = sc.nextInt();

        String result = (num%2==0) ? "짝수:" : "홀수";

        System.out.println("입력한 숫자 " + num + "는 " + result + "입니다.");
    }
}
