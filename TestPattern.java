public class TestPattern{
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int a=0;a<=3;a++){
             for(int i=1;i<=1;i++){
            System.out.print("*");
            }
            for(int j=0;j<=a;j++){
            System.out.print(" ");
            }
            for(int k=1;k<=1;k++){
            System.out.print("*");
            }
            System.out.println("");
        }
       for(int a=0;a<=1;a++){
        for(int i=1;i<=1;i++){
            System.out.print("*");
        }
        for(int i=2;i>a;i--){
            System.out.print(" ");
        }
        for(int i=1;i<=1;i++){
            System.out.print("*");
        }
       System.out.println("");
       }
       for(int i=0;i<=4;i++){
        System.out.print("*");
       }
    }
}