package 인터페이스;

public class MyClass {
    //필드
    RemotdeControl rc = new Television();

    //생성자
    MyClass(){}

    public MyClass(RemotdeControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    //메서드
    void methodA(){
        RemotdeControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemotdeControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }
}
