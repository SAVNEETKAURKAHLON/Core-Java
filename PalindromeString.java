import java.util.Scanner;
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in)    ;
        System.out.println("enter the string");
        String a=sc.next();
        String temp="";
        for(int i=a.length()-1;i>=0;i--){
            temp=temp+a.charAt(i);
        }
        if(a.equals(temp)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
