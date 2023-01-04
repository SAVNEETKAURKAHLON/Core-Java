import java.util.Scanner;
public class Multiarray {
    /**
     * @param args
     */
    public static void main(String args[]){
        int a[][]={{1,1},{2,2}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
                System.out.println("");
        }
       int b[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the column");
        int column=sc.nextInt();
        
        b=new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.println("enter i "+i+" enter j "+j);
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
