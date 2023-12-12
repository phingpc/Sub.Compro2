
import java.util.Scanner;


public class Longest_String1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int summax=0;
        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            int go = str.length();
            if(go>min){
                summax=go;
                min=go;
            }
        }
        System.out.printf("%d",summax);
    }
}
