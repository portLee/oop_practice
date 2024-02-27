package ex04_polymorphism;

public class Main {
    public static void main(String[] args) {

        // 원래 사용했던 객체 생성 방식
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        // 다형성을 활용한 객체 생성 방식
        Vehicle car2 = new Car();

        // 상위 클래스 타입의 객체 배열 생성
        Vehicle vehicles[] = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new MotorBike();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass()); // 각각의 클래스를 호출해주는 메서드
        }
    }
}