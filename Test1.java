import java.util.Scanner;
public class Test1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of currency denominations ");
        int size=sc.nextInt();
       int currencyNotes[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the currency denomination to "+i+" position");
            currencyNotes[i]=sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay ");
        int amount=sc.nextInt();
         int c=amount;
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(currencyNotes[i]>currencyNotes[j]){
                    int temp=currencyNotes[i];
                    currencyNotes[i]=currencyNotes[j];
                    currencyNotes[j]=temp;
                }
            }
            }
         for(int i=0;i<size;i++){
            int d=(c/currencyNotes[i]);
            System.out.println(currencyNotes[i]+" = "+d);
                c=(c%currencyNotes[i]);
           
            }
         }
        }

