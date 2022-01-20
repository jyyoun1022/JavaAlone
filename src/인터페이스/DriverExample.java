package 인터페이스;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  //자동타입변환: Vicle vicle = bus
        driver.drive(taxi); //자동타입변환: Vicle vicle = taxi
    }
}
