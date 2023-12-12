
import java.util.Scanner;

public class CardPair1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 5; i++) {
            String A = scan.next();
            String B = scan.next();
            // A
            char a = A.charAt(0);
            char aa = A.charAt(1);
            if ((int) a < (int) aa) {
                sumA = (int) a;
            } else {
                sumA = (int) aa;
            }
            // B
            char b = B.charAt(0);
            char bb = B.charAt(1);
            if ((int) b < (int) bb) {
                sumB = (int) b;
            } else {
                sumB = (int) bb;
            }
            if (a == aa) {
                if (b == bb) {
                    if (sumA < sumB) {
                        System.out.print("W");

                    } else if (sumA > sumB) {
                        System.out.print("L");

                    } else if (sumA == sumB) {
                        System.out.print("D");
                    }
                }
                else {
                    System.out.print("W");
                }
            } else if (b == bb) {
                System.out.print("L");
            } else if (sumA < sumB) {
                System.out.print("W");

            } else if (sumA > sumB) {
                System.out.print("L");

            } else if (sumA == sumB) {
                System.out.print("D");
            }
            sumA = 0;
            sumB = 0;
        }
    }
}
