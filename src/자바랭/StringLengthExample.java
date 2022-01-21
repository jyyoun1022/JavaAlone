package 자바랭;

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn ="123456789012";
        int length =ssn.length();
        if(length==13){
            System.out.println("주민번호 자리수가 맞습니다.");
        }else{
            System.out.println("주민번호 자리수와 맞지 않습니다.");
        }
    }
}
