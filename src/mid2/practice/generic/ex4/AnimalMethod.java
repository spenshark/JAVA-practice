package mid2.practice.generic.ex4;

import mid2.practice.generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t){
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
