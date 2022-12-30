import java.util.Scanner;
public class DoubleArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        a=new int[size];
        int b[]=new int[size];
        for(int i=0;i<size;i+=2){
            System.out.println("enter the value of "+i);
             a[i]=sc.nextInt();
             b[i]=a[i];
             b[i+1]=a[i]*2;

        }
        for(int i=0;i<(size);i++){
            System.out.println("new array "+i+ " " +b[i]);

        }
    }
}