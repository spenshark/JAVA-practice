package mid1.practice.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerOf = Integer.valueOf(10);
        Integer integerOf1 = Integer.valueOf(127);
        Integer integerOf2 = Integer.valueOf(127);
        Integer integerOf3 = Integer.valueOf(128);
        Integer integerOf4 = Integer.valueOf(128);

        System.out.println(newInteger==integerOf);
        System.out.println(integerOf1==integerOf2);
        System.out.println(integerOf3==integerOf4);
    }

}
