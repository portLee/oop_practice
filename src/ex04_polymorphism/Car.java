package ex04_polymorphism;

public class Car implements Vehicle { // 이동수단을 구체화한 자동차 클래스

    String model;
    String color;
    int wheels;
    boolean isConvertible;

    @Override
    public void start() {
        System.out.println("시동을 겁니다.");
    }

    @Override
    public void moveForward() {
        System.out.println("자동차가 앞으로 전진합니다.");
    }

    @Override
    public void moveBackward() {
        System.out.println("자동차가 뒤로 후진합니다.");
    }
    
}
