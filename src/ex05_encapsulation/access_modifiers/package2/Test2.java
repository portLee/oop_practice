package ex05_encapsulation.access_modifiers.package2; // package2

// 파일명 Test2.java
import ex05_encapsulation.access_modifiers.package1.SuperClass;

class SubClass extends SuperClass { // package1으로부터 SuperClass 클래스를 상속
    @Override
    public void printEach() {
//        System.out.println(a); // 에러 발생!
//        System.out.println(b);
        System.out.println(c); // 다른 패키지의 하위 클래스
        System.out.println(d);
    }
}

public class Test2 {
    public static void main(String[] args) {
        SuperClass parent = new SuperClass();

//        System.out.println(parent.a); // public을 제외한 모든 호출 에러!
//        System.out.println(parent.b);
//        System.out.println(parent.c);
        System.out.println(parent.d);
    }
}
