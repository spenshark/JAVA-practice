package mid1.ex.enumeration.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);

        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}