package day15;

public abstract class Animal {

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    //2. 추상메소드 선언
        // 클래스가 추상클래스 이면 선언 가능
        // {} 구현부를 생략한다
    public abstract void sound();
}
