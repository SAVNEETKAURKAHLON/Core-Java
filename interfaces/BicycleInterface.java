package interfaces;

public class BicycleInterface implements VehicleInterface{
    @Override
    public void speed(){
        System.out.println("speed of bicycle is 2");
    }
    @Override
    public void breaks(){
        System.out.println("brakes were applied early");
    }
    public static void main(String args[]){
        BicycleInterface bicycleInterface=new BicycleInterface();
        bicycleInterface.speed();
        bicycleInterface.breaks();
    }
}
