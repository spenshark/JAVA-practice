package mid1.practice.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstatnceValue = 1;

        public void print(){
            System.out.println(nestedInstatnceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 틀래스 멤에는 접근할 수 있다. private이어도 가능
            System.out.println(outClassValue);
        }
    }
}
