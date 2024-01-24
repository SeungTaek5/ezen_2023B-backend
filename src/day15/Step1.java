package day15;

public class Step1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);

        driver.drive(taxi);
    }
}
