
import java.util.Scanner;


public class Partition1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        int[] N = new int[x];
        for(int i=0; i<x; i++){
           int a = scan.nextInt();
           N[i] = a ;
        }
        int middle = N[x/2];
        //System.out.printf("%d ",middle);
        for(int i=0; i<x; i++){
            if(N[i]<=middle){
                System.out.printf("%d ",N[i]);
            }
        }
        System.out.println("");
        for(int i=0; i<x; i++){
            if(N[i]>middle){
                System.out.printf("%d ",N[i]);
            }
        }
    }
}

