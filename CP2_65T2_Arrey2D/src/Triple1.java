
import java.util.Scanner;


public class Triple1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] arr = new int[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int K = scan.nextInt();
        for(int i=0; i<R; i++){
            int count=0;
            for(int j=0; j<C; j++){
                if (arr[i][j]==K){
                    count++;
                }
                else {
                    count=0;
                }
                if(count >= 3)
                {
                    System.out.printf("%d ",i+1);
                    break;
                }
            }
        }
    }
}
