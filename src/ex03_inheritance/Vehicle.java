package ex03_inheritance;

public class Vehicle { // 추상화를 통한 상위클래스 정의

    String model;
    String color;
    int wheels;

    void start() {
        System.out.println("시동을 겁니다.");
    }

    void moveForward() {
        System.out.println("전진합니다.");
    };

    void moveBackward(){
        System.out.println("후진합니다.");
    };
}
