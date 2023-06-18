
import java.util.Scanner;

class Characters {

    public String words;

    public Characters(String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println(words);
    }
}

public class CharVoice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ;
        final int N = scan.nextInt();
        String[] msg = new String[N];
        scan.nextLine();
        Characters[] C = new Characters[N + 1];
        for (int i = 0; i < N; ++i) {
            msg[i] = scan.nextLine();
            Characters chars = new Characters(msg[i]);
            C[i] = chars;
        }
        int A = scan.nextInt();
        int i = 0;
        int target = 0;
        while (true) {
            C[i].speak();
            i++;
            target++;
            if (target == A) {
                break;
            }
            if (i == N && target < A) {
                i = 0;
            }

        }
    }
}
