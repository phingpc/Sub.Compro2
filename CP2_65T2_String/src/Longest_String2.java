
import java.util.Scanner;


public class Longest_String2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int min = Integer.MIN_VALUE;
        String longestStr = " ";
        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            int go = str.length();
            if(go>min){
                min=go;
                longestStr = str;
            }
        }
        System.out.print(longestStr);
    }
}
