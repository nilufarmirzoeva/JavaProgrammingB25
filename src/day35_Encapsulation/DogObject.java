package day35_Encapsulation;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Taikan ","Small ",'F',2,"Black ");
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.sleep();
        System.out.println("has "+Dog.numberOfEyes+" eyes");
        System.out.println("has " + Dog.numberOfLegs+" legs");
        System.out.println("has " + Dog.numberOfWings+" wings");
    }
}
