package ex03_inheritance;

public class Car extends Vehicle {

    // Car 클래스 고유의 속성
    boolean isConvertible;

    // Car 클래스 고유의 기능
    void openWindow() {
        System.out.println("모든 창문을 엽니다.");
    }
    
}
