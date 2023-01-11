package inheritance;

public class Dog extends AnimalClass{
     Dog(){
        System.out.println("constctor dog is called");
    }
    void bark(){
        System.out.println("dog is barking");
    }
    public static void main(String args[]){
        Dog dog =new Dog();
        dog.legs=4;
        dog.eyes=2;
        System.out.println(dog.legs);
        System.out.println(dog.eyes);
        dog.eat();
        dog.bark();
    }
}
