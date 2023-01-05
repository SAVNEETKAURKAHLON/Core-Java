import java.util.Scanner;
public class AdditionArray {
    int [][] getValues(Scanner sc,int column,int row){
        int a[][]=new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.println("enter the value at "+i+"and "+j);
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
    void displayValues(int column,int row,int a[][]){
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[i][j]+" ");            
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][];
        System.out.println("enter the value of column");
        int column=sc.nextInt();
        System.out.println("enter the value of row");
        int row=sc.nextInt();
        a=new int[column][row];
        int b[][]=new int[column][row];
        int c[][]=new int[column][row];
        AdditionArray additionArray = new AdditionArray();
        System.out.println("enter the value of first array");
        a=additionArray.getValues(sc, column, row);
        System.out.println("enter the value of second array");
        b=additionArray.getValues(sc, column, row);
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                c[i][j]=a[i][j]+b[i][j];
        // System.out.println("sum is "+c[i][j]);

            }
        }
        System.out.println("value of array a");
        additionArray.displayValues(column, row, a);
        System.out.println("value of array b");
        additionArray.displayValues(column, row, b);
        System.out.println("value of sum of a and b");
        additionArray.displayValues(column, row, c);
    

    }
}
