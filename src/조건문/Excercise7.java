package 조건문;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run =true;
        int balance=0;


        while(run){
            System.out.println("=============================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("=============================");
            System.out.println("선택>");
            int input =Integer.parseInt(sc.nextLine());
           switch (input){
               case 1 :
                   System.out.println("예금액>");
                   balance += Integer.parseInt(sc.next());

               case 2 :
                   System.out.println("출금액>");
                   balance -=Integer.parseInt(sc.next());

               case 3 :
                   System.out.println("잔고>");
                   System.out.println(balance);

               case 4:
                  run =false;
                   break;

            }
            System.out.println();
        }


    }
}
