package 인터페이스;

import 상속.HankookTire;

public class Car {
    Tire frontLeftTire = new HangukTire();
    Tire frontRightTire = new HangukTire();
    Tire backLeftTire = new HangukTire();
    Tire backRightTire = new HangukTire();
    //자동차를 설계할 때 이와 같이 필드  타입으로 타이어 인터페이스를 선언하면 필드값으로 한국타이어 또는 금호타이어 객체를 대입할 수 있다.

    public void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
