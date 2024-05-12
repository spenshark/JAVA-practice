package mid1.ex.nested;

public class OuterClass3 {

    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
