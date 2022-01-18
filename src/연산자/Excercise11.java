package 연산자;
import java.util.Scanner;

public class Excercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        String id =sc.next();
        System.out.println("비밀번호 : ");
        String strPassword = sc.next();
        int password = Integer.parseInt(strPassword);

        if(id.equals("Java")){
            if(password == 1022){
                System.out.println("로그인성공");
            }else{
                System.out.println("로그인 실패");
            }
        }else{
            System.out.println("아이디를 다시확인해주세요.");
        }

    }
}
