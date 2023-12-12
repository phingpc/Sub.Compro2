
import java.util.Scanner;

public class Spell_Checking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] dic = new String[N];
        for(int i=0; i<N; i++){
            dic[i] = sc.next();
        }
        
        int M = sc.nextInt();
        String[] word = new String[M];
        for(int i=0; i<M; i++){
            word[i] = sc.next();
        }
        //
        String answer = "";
        int maxscore=-1;
        for(int i=0; i<M; i++){
            String word2 = dic[i];
            int L = word[i].length();
            if(word2.length()<L){
                L = word2.length();
            }
            int score=0;
            for(int j=0; j<N; j++){
                char c1 = word[i].charAt(j);
                char c2 = word2.charAt(j);
                if(c1 == c2){
                    score++;
                }
            }
            if(maxscore < score){
                maxscore = score;
                answer = word2;
            }
            System.out.println(answer);
        }
    }
}
