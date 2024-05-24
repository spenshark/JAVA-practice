package mid2.practice.collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);

    }
}
