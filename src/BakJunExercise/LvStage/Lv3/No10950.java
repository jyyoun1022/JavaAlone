package BakJunExercise.LvStage.Lv3;

import java.util.Arrays;
import java.util.Scanner;

public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int arr[] = new int[c];

        for(int i =0; i<c; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i]= a+b;
        }
        sc.close();

       for(int k : arr){
           System.out.println(k);
       }
    }
}
//원리는 각 배열 원소마다 입력받은 a와 b를 더해주며 i번째 배열에 저장하는 원리이다.