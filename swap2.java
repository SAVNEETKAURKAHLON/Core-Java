import java.util.Scanner;
public class Swap2{
    public static void main(String args[]){
        System.out.println("helo");
        Scanner sc=new Scanner(System.in);
        int a=2;
        int b=4;
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);

    }
}