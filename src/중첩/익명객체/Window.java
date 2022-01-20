package 중첩.익명객체;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    Button.OnClickListener listener = new Button.OnClickListener() {//필드값으로 익명객체대입
        @Override
        public void onClick() {
            System.out.println("전원을 겁니다.");
        }
    };
    Window(){
        button1.setListener(listener);//매개값으로 필드 대입
        button2.setListener(new Button.OnClickListener() {//매개값으로 익명 객체 대입
            @Override
            public void onClick() {
                System.out.println("매시지를 보냅니다.");
            }
        });
    }
}
