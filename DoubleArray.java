import java.util.Scanner;
public class DoubleArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++){
            if(i>0){
            System.out.println("enter the value of "+i);
             a[i]=sc.nextInt();
             
                int n=i*2;
            System.out.println("enter the value of "+n);

            }
        }
    }
}