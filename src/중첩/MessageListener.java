package 중첩;

public class MessageListener implements Button.onClickListener{
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
