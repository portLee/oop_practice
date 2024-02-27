package ex01_object;

public class Car {
    // 속성 정의
    String company;
    String model;
    String color;
    int wheels;
    boolean isConvertible;

    // 기능 정의
    void startEngine() {
        System.out.println("시동을 겁니다.");
    }

    void moveForward() {
        System.out.println("자동차가 앞으로 전진합니다.");
    }

    void moveBackward() {
        System.out.println("자동차가 뒤로 후진합니다.");
    }
}
