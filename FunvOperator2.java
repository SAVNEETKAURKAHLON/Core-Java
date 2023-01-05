import java.util.Scanner;
public class FunvOperator2 {
    void sum(int a,int b){
        System.out.println("the value of sum is "+(a+b));
    }
    void subtract(int a,int b){
        System.out.println("the value of sum is "+(a-b));
    }
    void divide(int a,int b){
        System.out.println("the value of sum is "+(a/b));
    }
    void multiply(int a,int b){
        System.out.println("the value of sum is "+(a*b));
    }
    void modulas(int a,int b){
        System.out.println("the value of sum is "+(a%b));
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a;
            System.out.println("enter the value of a ");
            a=sc.nextInt();
            int b;
            System.out.println("enter the value of b ");
            b=sc.nextInt();
            System.out.println("enter the value of c form performing operation ");
            int c=sc.nextInt();
            FunvOperator2 funcOperator=new FunvOperator2();
            switch(c){
                case 1:{
                    funcOperator.sum(a,b);
                }
                break;
                case 2:{
                    funcOperator.subtract(a,b);
                }
                break;
                case 3:{
                    funcOperator.divide(a,b);
                }
                break;
                case 4:{
                    funcOperator.multiply(a,b);
                }
                break;
                case 5:{
                    funcOperator.modulas(a,b);
                }
            }
            
    }
}