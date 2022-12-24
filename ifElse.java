import java.util.Scanner;
public class ifElse{
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter the value of a");
        a=sc.nextInt();
        
        if(a>0 || a< 0){
            System.out.println("enter the value of b");
            b=sc.nextInt();
            int d = a<0? a*b:a/b;
            System.out.print 0.ln(d);
        }
        else{
            System.out.println("bye bye");
        }
    }
}