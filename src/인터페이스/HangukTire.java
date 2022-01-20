package 인터페이스;

public class HangukTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
