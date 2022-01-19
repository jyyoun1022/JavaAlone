package 추상클래스;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("===================");

        //변수의 자동 타입 변환
        Animal animal = new Dog();
        animal.sound();
        Animal animal2 = new Cat();
        animal2.sound();
        System.out.println("=======================");

        //매서드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }


        public static void animalSound(Animal animal) {
        animal.sound();

        }

    }

