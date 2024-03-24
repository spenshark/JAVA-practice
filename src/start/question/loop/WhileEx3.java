package start.question.loop;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 10;
        int sum = 0;
        int count = 1;

        while (count <= max) {
            sum += count;
            count++;
        }

        System.out.println(sum);
    }
}
