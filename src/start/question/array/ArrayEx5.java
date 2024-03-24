package start.question.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int minNumber = nums[0];
        int maxNumber = nums[0];

        for (int num : nums) {
            if (minNumber > num) {
                minNumber = num;
            }
            if (maxNumber < num) {
                maxNumber = num;
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
