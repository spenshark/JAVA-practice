package mid1.practice.enumeration.ref2;

import static mid1.practice.enumeration.ref2.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
