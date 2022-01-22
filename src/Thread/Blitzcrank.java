package Thread;

public class Blitzcrank {

    String skill_name;

    public Blitzcrank(String cmd) {
        this.skill_name = cmd;
    }

    public void run(){
        System.out.println("시전한 스킬: "+skill_name);

        for(int i=0; i<=3; i++){
            System.out.println(skill_name +"스킬을 "+i+"초간 시전 중입니다.");
        }
        System.out.println("시전 끝난 스킬 : "+skill_name);
    }

    public static void main(String[] args) {
        String[] cmd =new String[]{"Q","W","E"};    //Q,W,E를 넣고 순서대로 수행할 것

        for(int i=0; i<= cmd.length; i++){
            Blitzcrank b = new Blitzcrank(cmd[i]);  //객체화
            b.run();
        }
    }
}
