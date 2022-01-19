package OOP;

public class GetSetTest {
    public static void main(String[] args) {
        GetSet gs = new GetSet();

        //잘못된 속도 변경
        gs.setSpeed(-50);
        System.out.println("현재속도 : "+gs.getSpeed());

        //올바른 속도 변경
        gs.setSpeed(60);
        System.out.println("현재속도 : " +gs.getSpeed());

        //멈춤
        if(!gs.isStop()){
            gs.setStop(true);
        }

        System.out.println("현재속도 : "+gs.getSpeed());
    }
}
