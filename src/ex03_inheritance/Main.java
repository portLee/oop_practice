package ex03_inheritance;

public class Main {
    public static void main(String[] args) {

        // 객체 생성
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        // car 객체의 속성 정의
        car.model = "테슬라";
        car.color = "빨강색";

        System.out.println("나의 자동차는 " + car.color + " " + car.model + "입니다.");

        // 객체들의 기능 실행
        car.moveForward();
        motorBike.moveForward();
        motorBike.moveBackward();
    }
}