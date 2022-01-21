package 자바랭;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {

        //자동 박싱
        Integer obj =100;

        System.out.println("value : " + obj.intValue());

        //대입 시 자동 언박싱
        int value = obj;
        System.out.println(value);

        //연산시 자동 언박싱
        int result = obj +100;
        System.out.println("result : "+result);

    }
}
