package 자바랭;

import 인터페이스.Car;

public class ClassExample {
    public static void main(String[] args) throws Exception{
        //첫번째 방법
        Class clazz1 = Car.class;

//        //두번째 방법
//        Class clazz2 = Class.forName("src.인터페이스.Car");
//
//        //세번째 방법
//        Car car = new Car();
//        Class clazz3 = Car.getClass();
        System.out.println(clazz1.getSimpleName());
        String trime="이렇게 띄어쓰기를 하면 공백이 없어질까? ?";

        System.out.println(trime);
        String ex=trime.trim();
        System.out.println(trime.trim());
        System.out.println(ex);
    }
}
