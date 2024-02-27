package ex03_inheritance;

public class MotorBike extends Vehicle {

    // MotorBike 클래스 고유의 속성
    boolean isRaceable;

    // MotorBike 클래스 고유의 기능
    public void stunt() {
        System.out.println("오토바이로 묘기를 부립니다.");
    }

    // 메서드 오버라이딩 -> 기능 재정의
    @Override
    void moveForward() {
        System.out.println("오토바이가 앞으로 전진합니다.");
    }
    
}
