package mid1.practice.enumeration.basic;

import static mid1.practice.enumeration.basic.Grade.*;

public class ClassGradeMain {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        // Grade grade = new Grade(); -> Private 생성자라 객체 생성 불가

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 = " + basic);
        System.out.println("GOLD 등급의 할인 금액 = " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 = " + diamond);
    }
}
