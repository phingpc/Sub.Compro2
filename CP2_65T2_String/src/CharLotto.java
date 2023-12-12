
import java.util.Scanner;


public class CharLotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dictionary = new String[12];
        String[] word = new String[6];
        for(int i=0; i<12; i++){
            dictionary[i] = sc.next();
        }
        for(int i=0; i<6; i++){
            word[i]=sc.next();
        }
        //check
        int sum=0;
        for(int i=0; i<6; i++){
            int count=0;
            for(int j=0; j<12; j++){
                if(word[i].equals(dictionary[j])){
                    count++;
                }
            }
            System.out.printf("%d ",count);//out
            sum+=count;
        }
        System.out.println("");
        System.out.printf("%d ",sum);//out
    }
}
//AB KA ST TS AK YY ZZ PK KA WW JJ DA AK KA PK PK ZE WH
