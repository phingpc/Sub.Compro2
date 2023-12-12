
import java.util.Scanner;

public class MyClassArrey1D {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] a = new int[x];
        for (int i=0; i<x; i++){
            int b = scan.nextInt();
            a[i] = b;
        }
        int year = scan.nextInt();
        int sum_y = year - 1 ;
        for (int i=0; i<x; i++){
            a[i]+=sum_y;
            System.out.print(a[i]+" ");
        }
    }
}
