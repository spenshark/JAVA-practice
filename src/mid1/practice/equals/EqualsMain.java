package mid1.practice.equals;

public class EqualsMain {


    public static void main(String[] args) {
        User user1 = new User("id-100");
        User user2 = new User("id-100");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }


}
