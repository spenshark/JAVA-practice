package start.question.cond;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;

        String odd = (x%2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + odd);
    }
}
