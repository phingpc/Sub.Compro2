
import java.util.Scanner;


public class WordStats2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        String[] words = new String[x];
        int[] arrey = new int[26];
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] max = new int[26];
        int[] min= new int [26];
        for(int i=0; i<26; i++){
            min[i]=1000000;
        }
        for(int i=0; i<x; i++){
            words[i] = scan.next();
            char c = words[i].charAt(0);
            for(int j=0; j<26; j++){
                if (A.charAt(j)==c){
                    arrey[j]+=1;
                    if(words[i].length()>max[j]){
                        max[j]=words[i].length();
                    }
                    if(min[j]>words[i].length()){
                        min[j]=words[i].length();
                    }                  
                }
            }
        }
        for(int i=0; i<26; i++){
            if(arrey[i]!=0){
                System.out.printf("%s ",A.charAt(i));
                System.out.printf("%d ",min[i]);
                System.out.println(max[i]);
            }
        }
    }
}
