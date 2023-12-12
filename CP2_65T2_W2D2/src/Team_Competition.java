
import java.util.Scanner;

public class Team_Competition {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum_A = 0;
        int sum_B = 0;
        int[] a = new int[x];
        int[] b = new int[x];
        for(int i=0; i<x; i++){
            int hit_a = scan.nextInt();
            a[i] = hit_a;
        }
        for(int i=0; i<x; i++){
            int hit_b = scan.nextInt();
            b[i] = hit_b;
        }
        for(int i=0; i<x; i++){
            if(a[i]>b[i]){
                sum_A+=2;
            }
            else if (b[i]>a[i]){
                sum_B+=2;
            }
            if(a[i]==b[i]){
                sum_A+=1;
                sum_B+=1;
            }
        }
        //ans
        if(sum_A>sum_B){
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d",sum_A,sum_B);
        }
        else if(sum_B>sum_A){
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d",sum_B,sum_A);
        }
        else {
            System.out.println("Draw game");
            System.out.printf("Score %d to %d",sum_B,sum_A);
        }
        //ans
    }
}
