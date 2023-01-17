public class Exception1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("a/b " + c);
        } catch (ArithmeticException exception) {
            System.out.println("in exception " + exception);
        }

        int d[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.print(d[0]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("in exception "+exception.getMessage());
        }finally{
            System.out.println("in finally");
        }
        System.out.println("after exception");
    }
}