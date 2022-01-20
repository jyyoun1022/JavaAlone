package 인터페이스;

public class VicleExample {
    public static void main(String[] args) {
        Vicle vicle = new Bus();
        vicle.run();

        Bus bus = (Bus)vicle;
        bus.run();
        bus.checkFare();
    }
}
