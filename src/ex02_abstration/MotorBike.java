package ex02_abstration;

public class MotorBike implements Vehicle { // 이동수단을 구체화한 오토바이 클래스

    String model;
    String color;
    int wheels;
    boolean isRaceable;

    @Override
    public void start() {
        System.out.println("시동을 겁니다.");
    }

    @Override
    public void moveForward() {
        System.out.println("오토바이가 앞으로 전진합니다.");
    }

    @Override
    public void moveBackward() {
        System.out.println("오토바이가 뒤로 후진합니다.");
    }
    
}
