package start.question.method;

public class MethodEx2 {

    public static void main(String[] args) {

        String msg = "Hello, World";

        for (int i = 3; i < 8; i+=2) {
            output(msg, i);
        }
    }

    public static void output(String msg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }
}
