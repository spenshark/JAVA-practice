package basic.practice.poly.ex1;

public class AnimalPolyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow caw = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 울음 소리 시작");
        animal.sound();
        System.out.println("동물 울음 소리 끝");
    }
}
