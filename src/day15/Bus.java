package day15;

public class Bus extends Vehicle {

    // 부모타입으로부터 오버라이딩/재정의


    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
