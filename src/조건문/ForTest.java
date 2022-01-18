package 조건문;

public class ForTest {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<=100; i++){

            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
