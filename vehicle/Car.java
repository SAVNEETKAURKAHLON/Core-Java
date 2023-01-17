package vehicle;
public class Car extends PoweredVehicle{
    int myEngineSize=15;
    public static void main(String args[]){
        Car car =new Car();
        System.out.println(car.myBrand+" "+car.myModel+" "+car.myEngineSize);
    }
}