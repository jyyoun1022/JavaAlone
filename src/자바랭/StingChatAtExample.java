package 자바랭;

public class StingChatAtExample {
    public static void main(String[] args) {
        String jaeYeal = "961022-1616919";
        char sexAble = jaeYeal.charAt(7);
        switch (sexAble){
            case '1' :
                System.out.println("남자입니다.");
                break;
            case '2' :
                System.out.println("여자입니다.");
                break;
            case'3':
                System.out.println("00년생이후의 남자입니다.");
                break;
        }
    }
}
