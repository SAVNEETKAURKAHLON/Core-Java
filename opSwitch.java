import java.util.Scanner;
public class opSwitch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("enter the value of c\n1 for addition\n2for subtraction\n3for division\n4for multiplication\n5for reminder");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("ans is "+(a+b));
            
            break;
            case 2:
                System.out.println("ans is "+(a-b));
            
            break;
            case 3:
                System.out.println("ans is "+(a/b));
            
            break;
            case 4:
                System.out.println("ans is "+(a*b));
            
            break;
            case 5:
                System.out.println("ans is "+(a%b));
            break;
            default:
            System.out.println("not valid");
            break;
        }
        }
}
        
        