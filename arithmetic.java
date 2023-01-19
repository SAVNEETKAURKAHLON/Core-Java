import java.util.Random;

public class arithmetic{
    public static void main(String args[]){
        System.out.println("helo");
        int a=2345;
        int b=8;
        int c=3;
        int d=5;
        System.out.println("addition of 2435+8 is "+(a+b));
        System.out.println("division "+((a+b)/c));
        System.out.println("quotient "+(c%d));
        System.out.println("multiplication "+((c%d)*d));

        Random random = new Random();
        int ran  = random.nextInt(4 - 0) + 0;
        System.out.print(" ran "+ran);
    }
}