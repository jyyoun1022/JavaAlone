package 인터페이스;

public class MyclassExample {
    public static void main(String[] args) {
        System.out.println("1)========================");

        MyClass myclass1 = new MyClass();
        myclass1.rc.turnOn();
        myclass1.rc.setVolume(5);
        System.out.println("2)========================");

        MyClass myclass2 = new MyClass(new Audio());

        System.out.println("3)========================");

        MyClass myclass3 = new MyClass();
        myclass3.methodA();

        System.out.println("4)========================");
        MyClass myclass4 = new MyClass();
        myclass4.methodB(new Television());
    }
}
