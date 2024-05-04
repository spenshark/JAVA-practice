package mid1.practice.enumeration.past;

public class ClassGradeMain {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        // discount의 매개변수로 ClassGrade를 받아서 객체를 생성해야 하나? 라고 생각할 수 있음
        // new ClassGrade(); 해야하나 착각할 수 있음. -> 문제 해결을 위해 private 생성자 추가
        // 가장 큰 단점 -> 코드를 많이 작성해야 함.
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 = " + basic);
        System.out.println("GOLD 등급의 할인 금액 = " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 = " + diamond);


    }
}
