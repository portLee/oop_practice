package ex04_polymorphism.dependency.ex01_problem;

import ex04_polymorphism.Car;
import ex04_polymorphism.MotorBike;

public class Driver {

    public void drive(Car car) {
        car.moveForward();
        car.moveBackward();
    }

    public void drive(MotorBike motorBike) {
        motorBike.moveForward();
        motorBike.moveBackward();
    }
}
