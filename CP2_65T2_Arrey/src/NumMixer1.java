
import java.util.Scanner;


public class NumMixer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++){
            int z = scan.nextInt();
            A[i]=z;
        }
        for(int i=0; i<N; i++){
            int x = scan.nextInt();
            B[i]=x;
        }
        int M = scan.nextInt();
        if(M>0){
            int j=N-1;
            for(int i=0; i<N; i++){
                System.out.printf("%d ",A[i]);
                System.out.printf("%d ",B[j]);
                j--;
            }
        }
        else if (M<=0){
            int j=N-1;
            for(int i=0; i<N; i++){
                System.out.printf("%d ",B[j]);
                System.out.printf("%d ",A[i]);
                j--;
            }
        }
    }
}
