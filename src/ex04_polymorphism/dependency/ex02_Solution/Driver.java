package ex04_polymorphism.dependency.ex02_Solution;

import ex04_polymorphism.Vehicle;

public class Driver {

    void drive(Vehicle vehicle) { // 매개변수로 인터페이스 타입의 참조변수를 전달
        vehicle.moveForward();
        vehicle.moveBackward();
    }
}
