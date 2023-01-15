package factorial;
public class Factorial{
    public Factorial(){
      System.out.println("factorial is ");
    }
    public starPattern(){
         for(int i=0;i<6;i++){
             for(int j=0;j<i;j++){
                 System.out.print("*");
             }
            System.out.println("");
        }
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
                 System.out.print("*");
            }
            System.out.println("");

        }
    }
}