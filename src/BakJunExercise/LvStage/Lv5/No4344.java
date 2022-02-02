package BakJunExercise.LvStage.Lv5;

import java.util.Scanner;

public class No4344 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int C=sc.nextInt();
        int arr[]=new int[C];

        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();

            double sum = 0;	// 성적 누적 합 변수

            //성적 입력 부분
            for(int j=0; j<C; j++){
                int score= sc.nextInt();//성적입력
                arr[j]=score;
                sum += score;
            }
            double mean = (sum/C);
            double count =0;//평균 넘는 학생 수변수

            //평균 넘는 학생 비율 찾기
            for(int j =0; j<C; j++){
                if(arr[j]>mean){
                    count++;
                }
            }
            System.out.println(count/C*100);
        }
    }
}
