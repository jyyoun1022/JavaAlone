package 자바랭;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn ="1234567890";

        String firstName = ssn.substring(0,6);  //0부터 6까지 그러나 6은 제외하고 추출합니다.
        System.out.println(firstName);

        String endName = ssn.substring(7);  //7부터 끝까지의 문자열을 추출한다.
        System.out.println(endName);
    }
}
