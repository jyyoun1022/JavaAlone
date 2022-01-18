package 연산자;
import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 =5;
        int var2 = 2;
        double var3 =var1/var2;
        System.out.println(var3);

        int lengthTop =5;
        int lengthBottom =10;
        int height =7;

        double area =(lengthTop+lengthBottom)*(double)height/2;
        System.out.println(area);

        double input1=sc.nextDouble();
        double input2=sc.nextDouble();

        double result = input1/input2;
        if(input2==0 || input2==0.0){
            System.out.println("무한대");
        }

        System.out.println("결과: "+result);

    }
}
