package 자바랭;

public class StringTrimExample {
    public static void main(String[] args) {
        String str1 ="  01234";
        String str2 = "        1234       ";
        String str3 = "1234      ";

        String str = str1.trim()+str2.trim()+str3.trim();
        System.out.println(str);

    }
}
