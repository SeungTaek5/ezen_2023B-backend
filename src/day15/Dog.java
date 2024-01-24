package day15;

public class Dog extends Animal{


    // 만일 상위클래스가 추상메소드가 있으면 꼭 재정의/오버라이딩 해야한다
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
