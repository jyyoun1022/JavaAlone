package 인터페이스;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        System.out.println();
        myCar.frontLeftTire=new GumhoTire();
        myCar.frontRightTire=new GumhoTire();

        myCar.run();

    }
}
