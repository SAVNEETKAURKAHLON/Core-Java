public class Kdiamond{
    public static void main(String args[]){
        for(int a=0;a<5;a++){
            for(int b=5;b>a;b--){
                 System.out.print("*");
            }
            for(int c=0;c<a;c++){
                System.out.print(" ");
            }
               for(int j=0;j<a;j++){
                System.out.print(" ");
            }
            for(int k=a;k<5;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int a=1;a<5;a++){
             for(int k=0;k<=a;k++){
                System.out.print("*");
            }
            for(int j=4;j>a;j--){
                System.out.print(" ");
            }
             for(int j=4;j>a;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=a;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} 