
import java.util.Scanner;

public class KeepTwo {

    String keepTwo(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char ch = str.charAt(0);
            String nstr = str.substring(1);
            int pos1= nstr.indexOf(ch);
            int pos2= nstr.lastIndexOf(ch);
            while (pos1 != pos2) {
               nstr = nstr.substring(0, pos2) + nstr.substring(pos2 + 1);
               pos1 = nstr.indexOf(ch);
               pos2 = nstr.lastIndexOf(ch);
            }
            return ch + keepTwo(nstr);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
