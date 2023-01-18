package interfaces;

import abstraction.Rectangle;

//multiple inheritance
public class AnimalInterfaceImplementation extends Rectangle implements AnimalInterface {
    //Run time 
    @Override
    public void activity() {
        System.out.println("animal is cat");
    }

    @Override
    public void color() {  
        System.out.print("Color is black");      
    }

    public static void main(String args[]) {
        AnimalInterfaceImplementation animalInterfaceImplementation = new AnimalInterfaceImplementation();
        animalInterfaceImplementation.activity();
        animalInterfaceImplementation.color();
    }
    
}
