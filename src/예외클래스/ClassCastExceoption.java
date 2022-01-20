package 예외클래스;

class Animal{}
class Dog extends  Animal{}
class Cat extends  Animal{}

public class ClassCastExceoption  {
    static void changeDog(Animal animal)throws ClassCastException{
//        if(animal instanceof Dog)
        Dog dog = (Dog) animal;
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);



    }
}
