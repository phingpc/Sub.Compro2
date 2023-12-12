
import java.util.Scanner;


public class ShotCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        int[][] arr = new int[K][2];
        int outside=0;
        int inside=0;
        for(int i=0; i<K; i++){
            int A =scan.nextInt();
            int B =scan.nextInt();
            if(A<=R && A>0){
                if(B<=C && B>0){
                    inside++;                                                                                                                                                                                                                                                                       
                }
                else {
                    outside++;
                }
            }
            else{
                outside++;
            }
        }
        // output
        System.out.printf("%d",inside);
        System.out.println("");
        System.out.printf("%d",outside);
    }
}
