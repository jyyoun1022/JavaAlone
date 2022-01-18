package 연산자;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요");
        double input1 =Double.parseDouble(sc.next());
        System.out.println("두 번째 수를 입력하세요.");
        double input2 = Double.parseDouble(sc.next());

        double result = input1/input2;

        if(input2 != 0.0){
            System.out.println("결과값: " + result);
        }else{
            System.out.println("결과: 무한대");
        }
    }
}
