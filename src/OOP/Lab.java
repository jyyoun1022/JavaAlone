package OOP;

public class Lab {
//    int x;
//    int y;

//    public Lab() {
//    }
//
//    public Lab(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double divide(int x,int y){
//        double result =0;
//        result = (double)x/y;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Lab lab = new Lab();
//
//        System.out.println(lab.divide(10,20));
//    }

    int sum(int[] values){
        int sum =0;
        for(int i=0; i< values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    int sum2(int ...values){
        int sum =0;
        for(int i=0; i< values.length; i++){
            sum += values[i];
        }
        return sum;
    }

}
