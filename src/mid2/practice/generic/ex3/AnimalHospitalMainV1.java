package mid2.practice.generic.ex3;

import mid2.practice.generic.animal.Cat;
import mid2.practice.generic.animal.Dog;

public class AnimalHospitalMainV1<T> {

    public static void main(String[] args) {
        AnimalHospital<Dog> dogHospital = new AnimalHospital<>();
        AnimalHospital<Cat> catHospital = new AnimalHospital<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // dogHospital.set(cat);

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
