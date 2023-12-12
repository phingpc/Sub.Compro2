
import java.util.Scanner;

public class CharPin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String x = scan.nextLine();
        char[] sc = str.toCharArray();
        char[] sc2 = x.toCharArray();
        //adjust
        char[] sc4 = x.toCharArray();
        for (int i = 0; i < sc.length - 1; i++) {
            if (sc[i] == sc4[0]) {

                if (sc[i + 1] == sc4[1]) {

                    if (sc[i + 2] == sc4[2]) {

                        sc[i] = sc2[2];
                        sc[i + 2] = sc2[0];

                    }
                }
            }
        }
        //out
        for (int i = sc.length - 1; i >= 0; i--) {
            System.out.print(sc[i]);
        }
        
    }
}
