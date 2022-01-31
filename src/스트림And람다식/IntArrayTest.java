package 스트림And람다식;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();
        //count()메서드의 반환 값이 Long이므로 int형으로 변환시켜주어야 합니다.

        double average = Arrays.stream(arr).average().getAsDouble();
        //average()의 리턴값 : OptionalDouble
        //getAsDouble()은 OptionalDouble타입을 Double타입으로 바꿔준다.

        int max = Arrays.stream(arr).max().getAsInt();
        //max()의 리턴값 : OptionalInt

        int min = Arrays.stream(arr).min().getAsInt();


        System.out.println("총합: "+sumVal);
        System.out.println("수 :"+count);
        System.out.println("평균 : "+average);
        System.out.println("최고값"+max);
        System.out.println("최소값"+min);

    }
}
