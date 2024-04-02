package basic.practice.poly.overriding;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
    
    public void childMethod(){
        System.out.println("자식의 메소드");
    }
}
