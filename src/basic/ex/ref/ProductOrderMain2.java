package basic.ex.ref;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int repeat = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[repeat];

        for (int i = 0; i < repeat; i++) {
            System.out.println((i+1) + "번 째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String  productName = sc.next();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createProductOrder(productName, price, quantity);
        }

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
