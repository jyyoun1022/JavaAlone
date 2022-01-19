package 상속;

public class KumhoTire extends Tire{

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location+"KumhoTire수명: "+(maxRotation-accumulatedRotation)+"회");
            return true;
        }else{
            System.out.println("*** "+location+"KumhoTire 수명 ***" );
            return false;
        }
    }
}
