package BakJunExercise.LvStage.Lv3;

import java.util.Scanner;

public class No11022 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();
        int sum=0;

        for(int i =1; i<=c; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            sum=a+b;

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
        }
        sc.close();
    }
}
