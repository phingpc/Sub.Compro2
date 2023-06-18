import java.util.Scanner;

class Characters {

    String[] words;
    int NumWord ;
    int count=0;
    public Characters(String[] words,int B) {
        this.words = words;
        this.NumWord = B;
    }

    void speak() {
        if(count < NumWord){
            count++;
            System.out.println(words[count]);
        } else if(count==NumWord){
            count =1;
            System.out.println(words[count]);
        }
    }
}

public class CharVoice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        Characters[] Char = new Characters[A+1];


        for(int i=1; i<=A; i++){
            int E = scan.nextInt();
            String[] words = new String[E+1];
            scan.nextLine();
            for(int p=1; p<=E; p++){
                words[p] = scan.nextLine();
            }
            Char[i] = new Characters(words,E);
        }
        
        
        final int Q = scan.nextInt() ;
        for(int j=0; j<Q; j++){
            int W = scan.nextInt();
            Char[W].speak();
        }
    }
}
/* 
 * It is Van Helsing time.
   Just give up.
   I did not see that coming.
*/