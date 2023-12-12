
import java.util.Scanner;

public class CharInRange1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] A = new String[3];
        String[] B = new String[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scan.next();
            B[i] = scan.next();
        }
        int sumA = 0;
        int sumB = 0;
        int sumQ = 0;
        int count=0;
        for (int i = 0; i < 3; i++) {
            String Q = scan.next();
            count=0;
            for (int j = 0; j < 3; j++) {
                char a = A[j].charAt(0);
                sumA = (int) a;
                char b = B[j].charAt(0);
                sumB = (int) b;
                char q = Q.charAt(0);
                sumQ = (int) q;
                //System.out.printf("%d %d//",sumA,sumB);
                //System.out.printf("(%d)",sumQ);
                if (sumA >= sumB) {
                    if (sumQ <= sumA && sumQ >= sumB) {
                        System.out.printf("%d ", j+1);
                        count++;
                    }
                } else if (sumA<=sumB){
                    if (sumQ >= sumA && sumQ <= sumB) {
                        System.out.printf("%d ", j+1);
                        count++;
                    }
                }
            }
            if(count == 0){
                System.out.printf("0");
            }
            System.out.println();
        }
    }
}
//B K C F Y J D F J
