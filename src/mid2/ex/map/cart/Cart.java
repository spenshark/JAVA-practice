package mid2.ex.map.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer amount) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + amount);
    }

    public void minus(Product product,  Integer amount) {
        int updateAmount = cartMap.getOrDefault(product, 0) - amount;
        if (updateAmount <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, updateAmount);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
