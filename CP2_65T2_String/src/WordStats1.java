
import java.util.Scanner;


public class WordStats1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        String[] words = new String[x];
        int[] arrey = new int[26];
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<x; i++){
            words[i] = scan.next();
            char c = words[i].charAt(0);
            for(int j=0; j<26; j++){
                if (A.charAt(j)==c){
                    arrey[j]+=1;
                }
            }
        }
        for(int i=0; i<26; i++){
            if(arrey[i]!=0){
                System.out.printf("%s ",A.charAt(i));
                System.out.println(arrey[i]);
            }
        }
    }
}
