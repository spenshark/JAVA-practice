package start.question.array;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int total = 0;
        double aver;

        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }

        aver = (double)total / nums.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + aver);
    }
}
