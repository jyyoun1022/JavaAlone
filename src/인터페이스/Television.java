package 인터페이스;

public class Television implements RemotdeControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemotdeControl.MAX_VOLUME){
            this.volume = RemotdeControl.MAX_VOLUME;
        }else if(volume<RemotdeControl.MIN_VOLUME){
            this.volume = RemotdeControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " +volume);
    }
}
