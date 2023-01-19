import java.util.Scanner;
public class TestVowel{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in)    ;
        System.out.println("enter the word");
        String a=sc.next();
        String temp="";
        int tempPosition=-1;
        for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              break;
           }
           else{
            tempPosition=i;
            temp=temp+a.charAt(i);
            System.out.println(temp);
           }
        }
        if(tempPosition>-1){
          a=a.substring(tempPosition+1,a.length());
          System.out.println(a);
        }
        a = a+temp+"ay";
        System.out.println(a);
      }
}