package mid1.practice.string;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue(){
        return value;
    }
}
