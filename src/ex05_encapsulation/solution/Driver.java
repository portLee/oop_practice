package ex05_encapsulation.solution;

public class Driver {

    private String name;
    private Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void drive() {
        car.operate(); // Car 클래스에 있는 메서드를 단순하게 호출
    }
}
