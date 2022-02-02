package BakJunExercise.LvStage.Lv5;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int [] arr = new int[C];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[C-1]);
        //이 메소드는 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드다.
        //이 메소드를 활용하여 정렬하면 최솟값은 배열의 첫번째 원소(index 0)에, 최댓값은 배열의 마지막 원소(arr.length-1)에 있을테니 이를 출력하면 된다.
    }
}
