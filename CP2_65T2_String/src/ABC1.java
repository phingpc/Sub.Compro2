
import java.util.Scanner;


public class ABC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        int len = x.length();
        int count=0;
        for(int i=0; i<len; i++){
            char a = x.charAt(i);
            char b = x.charAt(i+1);
            char c = x.charAt(i+2);
            if(a==b-1&&a==c-2){
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}
