import java.util.Scanner;
public class Functions {
    public static void calculateSum() {
        System.out.println("In function");
    }
    public static void withArgument(int a, int b) {
        System.out.println("in with argument " + a);
        return;
    }
    public static int withReturnType() {
        return 2;
    }
    public static void main(String args[]) {
        calculateSum();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        withArgument(value, 8);
        int a = withReturnType();
        System.out.println("a = " + a + " direct " + withReturnType());
    }
}
