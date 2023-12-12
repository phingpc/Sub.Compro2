
import java.util.Scanner;

public class GoInside {
    String goInside(String str, boolean front) {
        int length = str.length();
        String newword = "";
        if(str.length() <= 1){
            return str;
        } else {
            if(front){
                newword += str.charAt(0);
                newword += str.charAt(length-1);
            }
            else {
                newword += str.charAt(length-1);
                newword += str.charAt(0);
            }
            return newword + goInside(str.substring(1,length-1),(!front)) ;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);         
        String str = scan.next();         
        GoInside gi = new GoInside();         
        String answer = gi.goInside(str, true);         
        System.out.println(answer);
    }
}
