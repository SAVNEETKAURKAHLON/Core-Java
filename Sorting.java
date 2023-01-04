import java.util.Scanner;
public class Sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the value of "+i);
             a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(+a[i]);
        }
    }
}
