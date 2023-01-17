import java.util.Scanner;
public class TestFizz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.print("a%3 "+(a%3));
        if((a%3)==0){
            System.out.println("fizz");
        }
        else if((a%5)==0){
            System.out.println("buzz");
        }
        else if((a%3)==0&&(a%5)==0){
            System.out.println("fizzbuzz");
        }
        else{
            System.out.println(a);
        }
    }
}