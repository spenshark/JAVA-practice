package basic.practice.poly.ex2;

import basic.practice.poly.ex1.Animal;

public class AbstractMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
//        System.out.println("동물 소리 테스트 시작");
        animal.sound();
//        System.out.println("동물 소리 테스트 끝");
    }

    private static void moveAnimal(AbstractAnimal animal) {
//        System.out.println("동물 이동 시작");
        animal.move();
//        System.out.println("동물 이동 끝");
    }
}
