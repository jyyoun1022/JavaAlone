package 자바랭;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "Java programing";

        int location = subject.indexOf("progra");
        int location1 =subject.indexOf("Java");
        System.out.println(location);
        System.out.println(location1);

        if(subject.indexOf("Java") != -1){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이군요.");
        }

    }
}
