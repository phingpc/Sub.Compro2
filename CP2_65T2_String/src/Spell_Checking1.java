
import java.util.Scanner;


public class Spell_Checking1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt();
        String[] dictionary = new String[N];
        String[] words = new String[10];
        for(int i=0; i<N; i++){
            dictionary[i] = scan.next();
        }
        for(int i=0; i<10; i++){
            words[i] = scan.next();
        }
        for(int i=0; i<10; i++){
            int count=0;
            for(int j=0; j<N; j++){
                if(words[i].equals(dictionary[j])){
                    System.out.printf("1");
                    count=0;
                    break;
                }
                else {
                    count++;
                }
            }
            if(count != 0){
                System.out.printf("0");
            }
        }
        
    }
}
