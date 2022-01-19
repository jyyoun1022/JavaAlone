package OOP;

public class Exercise03Test {
    public static void main(String[] args) {
        Exercise03 ex = new Exercise03();
        boolean result = ex.login("hong","12345");
        if(result){
            System.out.println("로그인 되었스빈다.");
            ex.logout("hong");
        }else{
            System.out.println("id또는password가 올바르지 않습니다.");
        }
    }
}
