package OOP;

public class WhyExam {
    int x;
    int y;

    int plus(int x, int y){
        int result = x+y;
        return result;
    }
    double plus(double x,double y){
        double result = x+y;
        return result;
    }

    public static void main(String[] args) {
        WhyExam ex = new WhyExam();
        ex.plus(10,20.7);
    }
}
