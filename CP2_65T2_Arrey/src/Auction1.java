
import java.util.Scanner;


public class Auction1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x; i++){
            int F = scan.nextInt();
            a[i] = F;
        }
        int y = scan.nextInt();
        int[][] b = new int[y][x];
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                int g = scan.nextInt();
                b[i][j]=g;
            }
        }
        for(int i=0; i<x; i++){
            if(b[0][i]<a[i]){
                b[0][i]=a[i];
            }
        }
        for(int i=0; i<x; i++){
            System.out.printf("%d ",b[0][i]);
        }
        System.out.println("");
        for(int i=1; i<y; i++){
            for(int j=0; j<x; j++){
                if(b[i-1][j]>b[i][j]){
                    b[i][j]=b[i-1][j];
                }
            }
        }
        
        for(int i=1; i<y; i++){
            for(int j=0; j<x; j++){
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println("");
        }
    }
}
