public class StarPattern2{
    public static void main(String args[]){
        for(int a=0;a<=9;a++){
            if(a<=5){
                 for(int b=0;b<a;b++){
                    System.out.print("*");
            }
            }
           for(int b=4;b<a;b--){
                    System.out.print("*");

           }
                    System.out.print("");

        }
    }
}