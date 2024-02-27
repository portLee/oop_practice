package ex05_encapsulation.problem;

public class Driver {

    private String name;
    private Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void drive() {
        // 결합도가 높음 -> 캡슐화를 활용해 낮춰야함
        car.startEngine();
        car.moveForward();
        car.openWindow();
    }
}
