package BakJunExercise.LvStage.Lv3;

import java.util.Scanner;

public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for(int i=1; i<=9;i++){
            System.out.println(a +" * "+i+" = "+a*i);
        }
    }
}
