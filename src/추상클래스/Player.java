package 추상클래스;

public abstract class Player {
    boolean pause;
    int currentPos;

    public Player(){
        this.pause=false;
        this.currentPos=0;
    }
    //지정된 위치에서 재생을 시작하는 기능 수행되도록 작성
    abstract void play(int pos);
    //재생을 즉시 멈추는 기능을 수행하도록 작성
    abstract void stop();

    public void pause(){
        if(pause){
            pause=false;
            play(currentPos);
        }else{
            pause = true;
            stop();
        }
    }
}
