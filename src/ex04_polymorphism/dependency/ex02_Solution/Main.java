package ex04_polymorphism.dependency.ex02_Solution;

import ex04_polymorphism.Car;
import ex04_polymorphism.MotorBike;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(); // 높은 결합도
        MotorBike motorBike = new MotorBike(); // 높은 결합도
        Driver driver = new Driver();

        driver.drive(car);
        driver.drive(motorBike);
    }
}
