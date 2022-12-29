public class Kpattern{
    public static void main(String args[]){
        for(int i=0;i<6;i++){
             for(int j=5;j>=i;j--){
                 System.out.print("*");
             }
            System.out.println("");
        }
        for(int a=0;a<=5;a++){
            for(int k=0;k<=a;k++){
                System.out.print("*");
            }
                System.out.println("");
        }
    } 
}