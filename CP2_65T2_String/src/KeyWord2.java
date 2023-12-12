
import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
public class KeyWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String[] words = new String[x];
        int sum=0;
        int count=0;
        for(int i=0; i<x; i++){
            words[i] = scan.next();
            count=0;
            for(int j=0; j<x; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
                if(count > sum ){
                sum=count;
                }
            }
            if(count==1){
                System.out.printf("%s ", words[i]);
            }
        }
        System.out.println();
        System.out.printf("%d ",sum);
        int h=0;
        for(int i=0; i<x; i++){
            count=0;
            for(int j=h; j<x; j++){
                if(words[i].equals(words[j])){
                    count++;
                    if(count==sum){
                    System.out.printf("%s ", words[i]);
                    break;
                    }
                }
            }
            h++;
        }
    }
}