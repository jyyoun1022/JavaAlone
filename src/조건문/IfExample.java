package 조건문;

public class IfExample {
    public static void main(String[] args) {
        int score =85;

        if(score >=90){
            System.out.println("점수가 90보다 크다");
            System.out.println("등급은 A등급입니다.");
        }else{
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B등급 입니다.");
        }
        System.out.println("이자리에는 뭐가 와야할까요");
    }
}
