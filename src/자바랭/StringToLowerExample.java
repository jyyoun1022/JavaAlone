package 자바랭;

import java.util.Locale;

public class StringToLowerExample {
    public static void main(String[] args) {
        String str1 ="Java programing";
        String str2 = "JAVA PROGRAMING";

        System.out.println(str1.equals(str2));

        String lowerStr1 = str1.toLowerCase();
        System.out.println(lowerStr1);
        String lowerStr2  = str2.toLowerCase();
        System.out.println(lowerStr2);
        String upper1 = str1.toUpperCase();
        System.out.println(upper1);
        String upper2 = str2.toUpperCase();
        System.out.println(upper2);
        System.out.println(lowerStr1.equals(lowerStr2));

        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
