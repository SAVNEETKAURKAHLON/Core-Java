import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int temp=a;
        int reverse=0;
        while(a>1){
        int b=a%10;
        reverse=reverse*10+b;
        a=a/10;
        }
        System.out.println(reverse);
        if(temp==reverse){
        System.out.println("number is palindrome");
        }
        else{
        System.out.println("number is not palindrome");
        }
    }
}