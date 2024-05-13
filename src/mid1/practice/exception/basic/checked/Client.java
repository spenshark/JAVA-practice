package mid1.practice.exception.basic.checked;

public class Client {
    public void call() throws MycheckedException{
        throw new MycheckedException("ex");
    }
}
