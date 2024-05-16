package mid2.practice.generic.ex2;

import mid2.practice.generic.animal.Animal;
import mid2.practice.generic.animal.Cat;
import mid2.practice.generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox1 = new Box<>();
        Box<Animal> animalBox2 = new Box<>();
        Box<Animal> animalBox3 = new Box<>();
        animalBox1.set(animal);
        animalBox2.set(dog);
        animalBox3.set(cat);

        Animal findAnimal1 = animalBox1.get();
        Dog findAnimal2 = (Dog) animalBox2.get();
        Cat findAnimal3 = (Cat) animalBox3.get();
        System.out.println("findAnimal = " + findAnimal1);
        System.out.println("findAnimal = " + findAnimal2);
        System.out.println("findAnimal = " + findAnimal3);
    }
}
