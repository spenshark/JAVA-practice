package mid2.ex.generic;

import mid2.ex.generic.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        return unit;
    }
}
