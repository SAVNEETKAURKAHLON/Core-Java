package vehicle;
public class Bicycle extends Vehicle{
    int myGearCount=5;
    public static void main(String args[]){
        Bicycle bicycle =new Bicycle();
        System.out.println(bicycle.myBrand+" "+bicycle.myModel+" "+bicycle.myGearCount);
    }
}