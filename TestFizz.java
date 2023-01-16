import java.util.Scanner;
public class TestFizz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        if((a/3)==1){
            System.out.println("fizz");
        }
        else if((a/5)==1){
            System.out.println("buzz");
        }
        else if((a/3)==1&&(a/5)==1){
            System.out.println("fizzbuzz");
        }
        else{
            System.out.println(a);
        }
    }
}