package 상속;
class Food{
    void print(){
        System.out.println("food");
    }
}
public class Lab2 extends Food{
    @Override
    void print() {
        System.out.println("SeaFood");
    }

    public static void main(String[] args) {
        Food food = new Lab2();
        food.print();
        Lab2 lab2 =(Lab2)food;
        lab2.print();
    }
}
