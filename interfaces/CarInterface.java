package interfaces;

public class CarInterface implements VehicleInterface{
    @Override
    public void speed(){
        System.out.println("speed of car is 5");
    }
    @Override
    public void breaks(){
        System.out.println("brakes are applied");
    }
    public static void main(String args[]){
        CarInterface carInterface=new CarInterface();
        carInterface.speed();
        carInterface.breaks();
    }
}
