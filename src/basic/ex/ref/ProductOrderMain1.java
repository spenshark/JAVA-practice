package basic.ex.ref;

public class ProductOrderMain1 {

    public static void main(String[] args) {

        ProductOrder order1 = createProductOrder("두부", 2000, 2);
        ProductOrder order2 = createProductOrder("김치", 5000, 1);
        ProductOrder order3 = createProductOrder("콜라", 1500, 2);

        ProductOrder[] orders = {order1, order2, order3};

        printOrders(orders);

        System.out.println("총 결제 금액: " + getTotalAmount(orders));

    }

    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ",수량: " + order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
