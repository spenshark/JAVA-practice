package mid2.practice.generic.ex5;

import mid2.practice.generic.animal.Animal;

public class Box<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
