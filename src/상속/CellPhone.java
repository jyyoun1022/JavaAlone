package 상속;

public class CellPhone {
    public String model;
    public String color;

    public CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    public void sendVoice(String message){
        System.out.println("자기: "+message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }

}
