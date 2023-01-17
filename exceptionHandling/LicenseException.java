import java.util.Scanner;

public class LicenseException extends Exception {
    LicenseException() {
        super();
    }

    LicenseException(String message) {
        super(message);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        int a = sc.nextInt();

        try {
            if (a <= 16) {
                LicenseException licenseException = new LicenseException("not eligible");
                throw licenseException;
            } else {
                System.out.println("eligible");
            }
        } catch (LicenseException abc) {
            System.out.print(abc.getMessage());
        }
    }
}
