package 상속;



public class Car {
    Tire frontLeftTire = new Tire(6,"앞왼쪽");
    Tire frontRightTire = new Tire(2,"앞오른쪽");
    Tire backLestTire = new Tire(3,"뒷왼쪽");
    Tire backRightTire = new Tire(4,"뒷오른쪽");

    public int run(){
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false){
            stop();
            return 1;
        }
        if(frontRightTire.roll()==false){
            stop();
            return 2;
        }
        if(backLestTire.roll()==false){
            stop();
            return 3 ;
        }
        if(backRightTire.roll()==false){
            stop();
            return 4;
        }else{
            return 0;
        }
    }
    public void stop(){
        System.out.println("자동차가 멈춥니다.");
    }

    public static void main(String[] args) {

    }
}
