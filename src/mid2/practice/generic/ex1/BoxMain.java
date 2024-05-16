package mid2.practice.generic.ex1;

public class BoxMain {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        System.out.println(integerBox.get());

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        System.out.println(stringBox.get());

        // 타입 추론
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        // GenericBox<> integerBox2 = new GenericBox<Integer>();
        // 이거는 안됨.
    }
}
