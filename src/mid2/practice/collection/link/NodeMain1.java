package mid2.practice.collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
