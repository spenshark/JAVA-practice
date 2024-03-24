package basic.practice.ref;

public class NullMain2 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        System.out.println("bigdata.data.value = " + bigData.data.value);

    }
}
