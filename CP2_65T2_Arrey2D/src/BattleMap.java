
import java.util.Scanner;


public class BattleMap {
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
        // output
        System.out.printf("%d",K);
        System.out.println("");
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println("");
        }
    }
}
