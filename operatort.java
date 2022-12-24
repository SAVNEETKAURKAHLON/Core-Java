import java.util.Scanner;
public class operatort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("enter the value of c\n1 for addition\n2for subtraction\n3for division\n4for multiplication\n5for reminder");
        int c=sc.nextInt();
        if(c<=0 || c>5){
            System.out.println("invalid input");
        }
        else{
            if(c==1){
                System.out.println(a+b);
            }
            else if(c==2){
                System.out.println(a-b);
            }
            else if(c==3){
                System.out.println(a/b);
            }
            else if(c==4){
                System.out.println(a*b);
            }
            else if(c==5){
                System.out.println(a%b);
            }
        }
    }
}