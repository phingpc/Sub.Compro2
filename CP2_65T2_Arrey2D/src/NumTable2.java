
import java.util.Scanner;


public class NumTable2 {
    
    public static void main(String[] args) {
        // input
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
         // input
        int sum=-123456;
        int count=0;
        // first check
        int C = scan.nextInt();
        int D = scan.nextInt();
            C-=1;
            D-=1;
            if(C<row && C>=0 && D<col && D>=0){
                    if(arr[C][D]!=sum){
                        System.out.printf("%d",arr[C][D]);
                        sum=arr[C][D];
                    }
                    else if (arr[C][D] == sum){
                        System.out.printf("*"); 
                    }
                
            }
        // first check
        // check
        for(int i=0; i<k-1; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            A-=1;
            B-=1;
            if(A<row && A>=0 && B<col && B>=0){
                    if(arr[A][B]!=sum){
                        if(count!=0){
                        System.out.println();
                        count=0;
                        }
                        System.out.printf("%d",arr[A][B]);
                        sum=arr[A][B];
                    }
                    else if (arr[A][B] == sum){
                        System.out.printf("*"); 
                    }
                
            }
            else {
                count++;
                sum=-123456;
            }
        }
    }
}
// 3 5 0 5 3 2 1 7 8 3 5 2 9 5 6 8 4 8 1 1 5 3 3 5 0 2 2 -1 2 3 3 2 2 4
// 3 5 0 5 3 2 1 7 8 3 5 2 9 5 6 8 4 14 2 2 3 4 7 2 1 1 3 3 3 5 0 2 2 -1 2 3 3 2 2 4 -5 -1 1 1 1 0 
// 4 7 0 5 3 2 1 3 7 7 8 3 1 2 5 6 9 5 6 8 4 7 8 7 2 3 4 3 2 1 20 1 1 5 3 3 5 0 2 -2 0 2 3 3 2 2 4 -1 2 4 7 3 6 2 5 1 4 2 5 3 6 5 7 5 8 5 7 1 7 4 1