package 상속.매개변수다형성;

public class InstaneofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child){
            Child child=(Child)parent;
            System.out.println("method1 -Child로 변환 성공");
        }else{
            System.out.println("mehtod1 - Child로 변환 되지 않음.");
        }
    }
    public static void method2(Parent parent){
        Child child =(Child)parent;
        System.out.println("method2- Child로 변환성공");
    }

    public static void main(String[] args) {
        Parent p1 = new Child();
        method1(p1);
        method2(p1);

        Parent p2 = new Parent();
        method1(p2);
        method2(p2);
    }
}
