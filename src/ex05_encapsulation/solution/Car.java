package ex05_encapsulation.solution;

public class Car {

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("시동을 겁니다.");
    }

    public void moveForward() {
        System.out.println("자동차가 앞으로 전진합니다.");
    }

    public void openWindow() {
        System.out.println("모든 창문을 엽니다.");
    }
    
    public void operate() { // 앞서 Driver 클래스에 정의된 메서드들 이동하여 메서드 추출
        startEngine();
        moveForward();
        openWindow();
    }
}
