package 상속.매개변수다형성;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver= new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  //자동 타입 변환: Vehicle vehicle=new Bus;
        driver.drive(taxi); //자동 타입 변환: Vehicle vehicle=new Taxi;
    }
}
