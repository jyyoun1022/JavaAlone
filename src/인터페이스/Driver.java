package 인터페이스;

public class Driver {
    public void drive(Vicle vicle){
        if(vicle instanceof Bus){
            Bus bus = (Bus)vicle;
            bus.checkFare();
        }
        vicle.run();
    }
}
