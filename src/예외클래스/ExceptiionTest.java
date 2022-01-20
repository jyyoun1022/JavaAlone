package 예외클래스;

public class ExceptiionTest {
    public static void main(String[] args) {


        String[] strArray = {"10", "a20"};
        int value = 0;
        for (int i = 0; i <= strArray.length; i++   ){
             try {
                 value = Integer.parseInt(strArray[i]);
             }catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("인덱스를 초과했어");
             }catch( NumberFormatException e){
                 System.out.println("숫자로 변할수가 없어");
             }finally {
                 System.out.println(value);
             }

        }
    }
}
