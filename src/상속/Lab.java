package 상속;
class Parent{
    void run(){
        System.out.println("디지게 뜁니다.");
    }
}
public class Lab extends Parent{
    @Override
    void run() {
        System.out.println("재정의 된 메서드가 출력됩니다.");
    }

    public static void main(String[] args) {
        Parent p1 = new Lab();
        p1.run();
    }
}
