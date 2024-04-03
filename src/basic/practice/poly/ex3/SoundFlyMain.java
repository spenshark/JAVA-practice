package basic.practice.poly.ex3;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chiken chiken = new Chiken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chiken);

//        flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chiken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
//        System.out.println("동물 소리 테스트 시작");
        animal.sound();
//        System.out.println("동물 소리 테스트 끝");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("날개 테스트 시작");
        fly.fly();
    }
}
