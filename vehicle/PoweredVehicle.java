package vehicle;
public class PoweredVehicle extends Vehicle{
    PoweredVehicle(){
        String myFuelType="petrol";
    }
    public static void main(String args[]){
        PoweredVehicle poweredVehicle=new PoweredVehicle();
        poweredVehicle.vehicle();
        System.out.println(myBrand+" "+mymodel+" "+myFuelType);

    }
}