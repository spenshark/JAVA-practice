package mid2.practice.set;

public interface Myset<E> {
    boolean add(E element);

    boolean remove(E value);

    boolean contains(E value);
}
