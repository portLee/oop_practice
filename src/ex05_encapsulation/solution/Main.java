package ex05_encapsulation.solution;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("테슬라 모델X", "레드");
        Driver driver = new Driver("김코딩", car);

        driver.drive();
    }
}
