import java.util.Scanner;
public class SearchingArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];
        System.out.println("enter the size of array ");
        int size=sc.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the value at "+a[i]);
            a[i]=sc.nextInt();
        }
    //    for(int i=0;i<size;i++){
    //     System.out.println("enter");
    //     int b=a[i];
    //        b=sc.nextInt();
        // System.out.println(+a[i]);
    //    }
    }
}