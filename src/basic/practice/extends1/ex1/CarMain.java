package basic.practice.extends1.ex1;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
    }
}
