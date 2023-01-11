package inheritance;

public class Cat extends AnimalClass{
    public static void main(String args[]){
        Cat cat =new Cat();
        cat.legs=4;
        cat.eyes=2;
        System.out.println("legs of cat is "+cat.legs);
        System.out.println("legs of cat is "+cat.eyes);
    }
   
}
