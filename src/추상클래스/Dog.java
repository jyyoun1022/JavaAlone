package 추상클래스;

public class Dog extends Animal{
    public Dog() {
        this.kind="포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
