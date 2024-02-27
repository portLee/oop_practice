package ex02_abstration;

public interface Vehicle {
    // 자동차와 오토바이 공통 기능을 추출하여 정의
    public abstract void start();
    void moveForward(); // public abstract 키워드 생략 가능
    void moveBackward();
}
