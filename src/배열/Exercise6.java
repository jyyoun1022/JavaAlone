package 배열;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        boolean run =true;
        int studentNum=0;
        int[] score = null;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("=======================");
            System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
            System.out.println("=======================");
            System.out.println("선택>");
            int selectNum =sc.nextInt();

            if(selectNum==1){
                System.out.println("학생수>");
                studentNum=sc.nextInt();
                score = new int[studentNum];
            }else if(selectNum==2){
                for(int i=0; i< score.length; i++){
                    System.out.println("score["+i + "] >");
                    score[i]=sc.nextInt();
                }
            }else if(selectNum==3){
                for(int i=0; i< score.length; i++) {
                    System.out.println("score[" + i + "] >" + score[i]);
                }
            }else if(selectNum==4){
                    int max=0;
                    int sum=0;
                    double avg =0;

                    for(int i=0; i< score.length; i++){
                        if(max<score[i]){
                            max=score[i];
                        }
                    }
                System.out.println("최고 점수: "+max);
                    for(int a : score){
                        sum += a;
                    }
                    avg=(double)sum/ score.length;
                System.out.println("평균값: "+avg);

                }else if(selectNum==5){
                run=false;
            }

        }
        System.out.println("프로그램종료");
        return;
    }
}
