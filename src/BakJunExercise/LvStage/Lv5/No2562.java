package BakJunExercise.LvStage.Lv5;

import java.util.Arrays;
import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr={ sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

        int count =0;
        int max =0;
        int index =0;

       for(int i=0; i<9; i++){
           count++;
           if(arr[i]>max) {
               max=arr[i];
               index=count;
           }

            }System.out.println(max+" "+index);
        }

    }
