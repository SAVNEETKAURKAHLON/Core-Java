public class TestPattern {
    public static void main(String args[]) {
        for (int i = 0; i <= 5; i++) {
            System.out.print("#" + " ");
        }
        System.out.println("");
        for (int a = 0; a <= 2; a++) {
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            for (int j = 0; j <= a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.print("#");
            }
            for (int f = 2; f > a; f--) {
                System.out.print(" ");
            }
            for (int f = 2; f > a; f--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.print("#");
            }
            for (int f = 0; f <= a; f++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        // for(int a=0;a<=0;a++){
        // for(int i=0;i<=a;i++){
        // System.out.print("-");
        // }
        // for(int i=4;i<=a;i++){
        // System.out.print("1");
        // }
        // System.out.println("");
        // }
        for (int a = 0; a <= 1; a++) {
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            for (int i = 1; i >= a; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            for (int i = 0; i <= a; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= a; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            for (int i = 1; i >= a; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        // last row
        for (int i = 0; i <= 5; i++) {
            System.out.print("#" + " ");
        }

    }
}