package 자바랭;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override   //toString의 재정의
    public String toString() {
        return company + "," +os;
    }
}
