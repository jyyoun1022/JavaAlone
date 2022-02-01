public class Lab {
    public int numberReturn(){
        return 10;
    }
    public String stringReturn(){
        return "문자반환";
    }

    public static void main(String[] args) {
        Lab lab = new Lab();
        int resultInt=lab.numberReturn();
        String resultString=lab.stringReturn();
        System.out.println(resultInt);
        System.out.println(resultString);
    }
}
