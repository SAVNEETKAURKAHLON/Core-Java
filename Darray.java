import java.util.scanner;
public class Darray{
    public static void  main(String args){
        int b[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter column");
        int column=sc.nextInt();
        System.out.println("enter row");
        int row=sc.nextInt();

        b=new int[column][row];
        for(int i=0;i<column;i++){
                for(int j=0;j<row;j++){
                    System.out.println("enter i "+i+" enter j "+j);
                    b[i][j]=sc.nextInt();
                }
        }
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.println(b[i][j]+" ");
            }
                System.out.println("");
        }
}
}