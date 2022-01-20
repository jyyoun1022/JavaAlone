package 중첩.익명객체;

public class AnonymousExample {
    public static void main(String[] args) {
        Annonymous annony = new Annonymous();
        //익명 객체 필드 사용
        annony.field.turnOn();
        //익명 객체 로컬 사용
        annony.method();
        //익명 객체 매개값 사용
        annony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("스마트 티비를 킵니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("스마트 티비를 끕니다.");
            }
        });
    }
}
