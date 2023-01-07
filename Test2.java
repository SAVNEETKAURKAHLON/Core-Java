import java.util.Scanner;
public class Test2 {
    public static void main(String args[]){
      int id[]=new int[]{1,2,3,4,5};
      String first[]=new String[]{"savneet","abc","qwr","ruyt","rygd"};
      int m1[]=new int[]{12,29,39,49,59};
      int m2[]=new int[]{21,72,63,54,45};
      char   grade[]=new char[]{'A','A','C','B','D'};
    System.out.println("students whose grade is A");
      for(int i=0;i<id.length;i++){
        if(grade[i]=='A'){
            System.out.println("id "+id[i]+" name "+first[i]);
        }
      }
    System.out.println("students whose marks in M1 is more than 35");
    for(int i=0;i<id.length;i++){
        if(m1[i]>35){
            System.out.println("id "+id[i]+" name "+first[i]);
        }
      }
    System.out.println("students record ");
    for(int i=0;i<id.length;i++){
            
            System.out.println("id "+id[i]+" name "+first[i]+" M1 "+m1[i]+" M2 "+m2[i]+" grade "+grade[i]+" total "+(m1[i]+m2[i]));
      }
    }
}
