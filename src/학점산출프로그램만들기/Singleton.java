package 학점산출프로그램만들기;

public class Singleton {
   private static Singleton one;

    private Singleton() {
    }
    public static Singleton getInstance(){
        if(one ==null){
            one = new Singleton();
        }return one;
    }
}
