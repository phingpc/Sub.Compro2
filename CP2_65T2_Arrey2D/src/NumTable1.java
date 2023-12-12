
import java.util.Scanner;


public class NumTable1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row+1][col+1]; 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            A-=1;
            B-=1;
            //System.out.printf("%d %d",A,B);
            
            if(A<row && A>=0){
                if(B<col && B>=0){
                    System.out.printf("%d",arr[A][B]);
                }
                else{
                    System.out.printf("-");
                }
            }
            else{
                System.out.printf("-");
            }
        }
    }
}
// 3 5 0 5 3 2 1 7 8 3 1 2 9 5 6 8  4 8 1 1 5 3 3 5 0 2 2 -1 2 3 3 2 2 4 
//4 7 0 5 3 2 1 3 7 7 8 3 1 2 5 6 9 5 6 8 4 7 8 7 2 3 4 3 2 1 20 1 1 5 3 3 5 0 2 -2 0 2 3 3 2 2 4 -1 2 4 7 3 6 2 5 1 4 2 5 3 6 5 7 5 8 5 7 1 7 4 1