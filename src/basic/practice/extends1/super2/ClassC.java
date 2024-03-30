package basic.practice.extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20);
        System.out.println("ClassC 생성자");
    }

    public void call(){
        System.out.println("확인용 " + super.A);
    }
}
