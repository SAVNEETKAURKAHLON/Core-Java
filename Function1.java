import java.util.Scanner;
public class Function1{
    void sum(int a,int b){
        int c=a+b;
        System.out.println("Sum is "+c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b ");
        int b=sc.nextInt();
        Function1 function1=new Function1();
        function1.sum(a,b);
    }
}