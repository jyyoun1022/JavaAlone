package BakJunExercise.LvStage.Lv5;

import 인터페이스.InterfaceC;

import java.util.Scanner;

public class No2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int arr[]=new int[10];

        int value = (A * B * C);

        while(value>0){
            arr[value%10]++;
            value /= 10;
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    }
