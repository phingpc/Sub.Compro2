
import java.util.Scanner;


public class NumReduction {
    public static void main(String[] args) {
        // กำหนด
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            int a = scan.nextInt();
            arr[i]=a;
        }
        // กำหนด
        //เปลี่ยนแปลง
        int Q = scan.nextInt();
        int[][] arr2 = new int[Q][2];
        for(int i=0; i<Q; i++){
            for(int j=0; j<2; j++){
                int b = scan.nextInt();
                arr2[i][j] = b;
            }
        }
        //เปลี่ยนแปลง
        int[][] arr3 = new int[Q][N];
        for(int i=0; i<Q; i++){
            for(int j=0; j<N; j++){
                arr3[i][j]+=arr[j];
            }
        }
        //เปลี่ยนแปลง
        
        //คำนวน
       
        
        
        
        
        
        
        //คำนวน
        //output
        for(int i=0; i<Q; i++){
            for(int j=0; j<N; j++)
            {
                System.out.printf("%d ",arr3[i][j]);
            }
            System.out.println("");
        }
    }
}
