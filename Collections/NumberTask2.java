import java.util.*;
public class NumberTask2{

    public static void main(String args[]){
        ArrayList<Integer> numbertask=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("enter the value at "+i);
            int number = sc.nextInt();
            numbertask.add(number);
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(numbertask.get(i)>numbertask.get(j)){
                       int temp=numbertask.get(i);
                       numbertask.set(i, numbertask.get(j));
                       numbertask.set(j,temp);
                }
            }
          
        }
         
        System.out.println("descending order is");

        for(int k=0;k<size;k++){
            System.out.println(numbertask.get(k));
        }
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(numbertask.get(i)<numbertask.get(j)){
                       int temp=numbertask.get(i);
                       numbertask.set(i, numbertask.get(j));
                       numbertask.set(j,temp);
                }
            }
          
        }
        System.out.println("ascending order is");

        for(int k=0;k<size;k++){
            System.out.println(numbertask.get(k));
        }
        System.out.println("highest number is "+numbertask.get(0));
        System.out.println("minimum number is "+numbertask.get(numbertask.size()-1));
    }
}