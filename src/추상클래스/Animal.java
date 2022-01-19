package 추상클래스;

public abstract class Animal {
    public String kind;

    public void breath(){
        System.out.println("숨을 쉽니다.");
    }
    public abstract void sound();

}
