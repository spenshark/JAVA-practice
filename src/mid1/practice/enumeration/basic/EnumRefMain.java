package mid1.practice.enumeration.basic;

import static mid1.practice.enumeration.basic.Grade.*;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + BASIC.getClass());
        System.out.println("class GOLD = " + GOLD.getClass());
        System.out.println("class DIAMOND = " + DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(BASIC));
        System.out.println("ref GOLD = " + refValue(GOLD));
        System.out.println("ref DIAMOND = " + refValue(DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
