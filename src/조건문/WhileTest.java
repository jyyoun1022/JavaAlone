package 조건문;

public class WhileTest {
    public static void main(String[] args) {


        while (true) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            if (a+b != 5) {
                System.out.println(a + "," + b);
            } else {
                break;
            }
        }
    }
}
