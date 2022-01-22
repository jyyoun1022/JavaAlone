package Thread;

public class Ahri extends Thread{
    String skill_name;

    public Ahri(String cmd){
        this.skill_name =cmd;
    }
    public void run(){
        System.out.println("시전할 스킬: "+skill_name);

        for(int i=1; i<=3; i++){
            System.out.println(skill_name+ " 스킬을 " +i+"초간 시전 중입니다.");
        }
        System.out.println("시전 끝난 스킬 : "+skill_name);
    }

    public static void main(String[] args) {
        String[]cmd =new String[]{"Q","W","E"};

        for(int i=0; i<=cmd.length; i++){
            Ahri a = new Ahri(cmd[i]);
            a.start();
        }
    }
}
