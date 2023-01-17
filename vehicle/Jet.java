package vehicle;
public class Jet extends PoweredVehicle{
    int myEngineSize=15;
    public static void main(String args[]){
        Jet jet =new Jet();
        System.out.println(jet.myBrand+" "+jet.myModel+" "+jet.myEngineSize);
    }
}