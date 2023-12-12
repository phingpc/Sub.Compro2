
import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x; i++){
            int z = scan.nextInt();
            a[i] = z;
        }
        int year = scan.nextInt();
        int count_Year = scan.nextInt();
        int[] years = new int[count_Year];
        for(int i=0; i<count_Year; i++){
            int c = scan.nextInt();
            years[i] = c;
        }
        //year-=1;
        for(int i=0; i<x; i++){
            a[i]+=year;
        }
        for(int i=0; i<count_Year; i++){
            int count = 0;
            for(int j=0; j<x; j++){
                if(years[i]>=a[j]){
                    System.out.printf("%d ",j+1);
                    count++;
                }
            }
            if(count==0){
                System.out.printf("full");
            }
            System.out.println("");
        }
    }
}
