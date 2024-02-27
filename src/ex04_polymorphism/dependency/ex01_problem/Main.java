package ex04_polymorphism.dependency.ex01_problem;

import ex04_polymorphism.Car;
import ex04_polymorphism.MotorBike;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        MotorBike motorBike = new MotorBike();
        Driver driver = new Driver();

        driver.drive(car);
        driver.drive(motorBike);
    }
}
