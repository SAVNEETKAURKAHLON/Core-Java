

public class Puppy extends Dog {
     Puppy(){
        System.out.println("constuctor puppy is called");
    }
    public static void main(String args[]){
        Puppy puppy =new Puppy();
        puppy.bark();
        puppy.eat();
        puppy.legs=4;
        puppy.eyes=2;
        System.out.println(puppy.legs);
        System.out.println(puppy.eyes);
    }
}
