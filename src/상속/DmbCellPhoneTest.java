package 상속;

public class DmbCellPhoneTest {
    public static void main(String[] args) {

        //DmbCellPhone 객체 생성
        DmbCellPhone dcp = new DmbCellPhone("galaxy","black",13);

        //CellPhone 클래스로 부터 상속받은 필드
        System.out.println(dcp.model);
        System.out.println(dcp.color);

        //DmbCellPhone 클래스의 필드
        System.out.println(dcp.channel);

        //CellPhone 클래스로 부터 상속 받은 메서드 호출
        dcp.powerOn();
        dcp.powerOff();
        dcp.bell();
        dcp.sendVoice("안녕하세요?");
        dcp.receiveVoice("네 안녕하세요~반갑습니다.");
        dcp.hangUp();

        //DmbCellPhone 클래스듸 메서드호출
        dcp.turnOnDmb();
        dcp.changeChannel(21);
        dcp.turnOffDmb();

    }
}
