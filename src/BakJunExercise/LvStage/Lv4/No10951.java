package BakJunExercise.LvStage.Lv4;

import java.util.Scanner;

public class No10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            //hasNextInt는 Scanner에서 정수를 입력받은 경우 true를,정수가 아니면 false를 반환받는 메서드이다.
    //Scanner에서 정수가 넘어오지 않는 경우 while문을 끝냅니다.
            System.out.println(A+B);
        }
        sc.close();
    }
}
