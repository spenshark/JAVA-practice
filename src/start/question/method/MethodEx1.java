package start.question.method;

public class MethodEx1 {

    public static void main(String[] args) {

        sum(1, 2, 3);
        sum(15, 25, 35);
    }

    public static void sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
