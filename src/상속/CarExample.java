package 상속;

//15,13,14,17, 왼쪽 한국, 오른쪽 금호타이어
public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i=0; i<=5; i++){
            int problemLocation = car.run();

            switch(problemLocation){
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire=new HankookTire(15,"앞왼쪽");
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire=new KumhoTire(13,"앞오른쪽");
                    break;
                case 3:
                    System.out.println("뒷왼쪽 HankookTire로 교체");
                    car.backLestTire=new HankookTire(14,"뒷왼쪽");
                    break;
                case 4:
                    System.out.println("뒷오른쪽 KumhoTire로 교체");
                    car.backRightTire=new KumhoTire(17,"뒷오른쪽");
                    break;
            }
            System.out.println("============================================");
        }
    }
}
