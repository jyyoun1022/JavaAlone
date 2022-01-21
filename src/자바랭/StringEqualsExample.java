package 자바랭;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = new String("신민철");
        String strVar2 = "신민철";

        if(strVar1 == strVar2){
            System.out.println("같은 string객체");
        }else{
            System.out.println("다른 String객체를 참조");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("같은 문자열을가진다.");
        }else{
            System.out.println("다른 문다열을 가집니다.");

        }
    }
}
