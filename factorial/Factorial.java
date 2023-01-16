package factorial;
public class Factorial{

     Factorial(int a){
      System.out.println("factorial is ");
      int b=1;
      for(int i=a;i>0;i--){
        b=b*i;
      }
      System.out.println(b);
    }
    public void starPattern(){
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
    public static void main(String args[]){
        Factorial factorial=new Factorial(4);
        factorial.starPattern();
    }
}