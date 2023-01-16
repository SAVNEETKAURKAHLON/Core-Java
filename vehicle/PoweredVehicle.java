package vehicle;
public class PoweredVehicle extends Vehicle{
    String myFuelType="petrol";
    public static void main(String args[]){
        PoweredVehicle poweredVehicle=new PoweredVehicle();
        System.out.println(poweredVehicle.myBrand+" "+poweredVehicle.myModel+" "+poweredVehicle.myFuelType);

    }
}