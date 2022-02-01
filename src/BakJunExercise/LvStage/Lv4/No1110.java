package BakJunExercise.LvStage.Lv4;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int copy = A;
        int count=0;

        while(true){
            A=((A%10)*10)+(((A/10)+(A%10))%10);
            count++;

            if(copy == A){
                break;
            }
        }
        System.out.println(count);
    }
}
