
import java.util.Scanner;


public class KeyWord1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String[] words = new String[x];
        for(int i=0; i<x; i++){
            words[i] = scan.next();
            int count=0;
            for(int j=0; j<x; j++){
                if(words[i].equals(words[j])){
                    count++;
                    if(count>=2){
                        break;
                    }
                }
            }
            if(count==1){
                System.out.printf("%s ", words[i]);
            }
        }
    }
}
//11 CAT BAT DOG CAT DOG PIG ANT ANT DOG RAT BAT