package OOP;

public class ShopService {
    private static ShopService singleton = new ShopService();
    //필드를 private로 만들고,
    //자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해서 초기화한다.
    private ShopService(){}
    //생성자를 private로 접근제어자로 해놓는다.
    static ShopService getInstance(){
        return singleton;
        //정적 메서드
    }


}
