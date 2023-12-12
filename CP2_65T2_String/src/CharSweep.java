
import java.util.Scanner;

public class CharSweep {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int target = scan.nextInt();
        int RorL = scan.nextInt();
        char C = text.charAt(target);
        String dictionary = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//dictionary word
        //out
        System.out.print(C);
        int Last = text.length();
        int i = target;
        int focus = 0;
        for (int g = 0; g < 26; g++) {
            if (dictionary.charAt(g) == text.charAt(target)) {
                focus = g;
                break;
            }
        }
        
        while (true) {
            if (RorL == 1) {
                i++;
                if (i == target ) {
                    break;
                }
                if (dictionary.charAt(focus)<= text.charAt(i)) {
                    System.out.print(text.charAt(i));
                }
                if (i + 1 == Last) {
                    i = 0;
                }
            } else if (RorL == -1) {
                i--;
                if (dictionary.charAt(focus) <= text.charAt(i)) {
                    System.out.print(text.charAt(i));
                }
                if (i == 0) {
                    i = Last ;
                }
                if (i == target + 1) {
                    break;
                }
            }
        }
    }
}