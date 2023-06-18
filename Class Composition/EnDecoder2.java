import java.util.Scanner;

class Decoder {
    String[] words;
    int[] inputword;
    public Decoder (String[] words,int[] inputword) {
        this.words = words ;
        this.inputword = inputword ;
    }
    private String decodeWord (String A){
        for(int p=1; p<=words.length-1; p++){
            if(this.words[p].equals(A)){
                return this.words[p]; // หาเจอแล้วหยุดการทำงานทันที
            }
        }
        return "?" ; // หาไม่เจอเลย จึงreturn ? แทน(โจทย์กำหนด)
    }
    void decodeMsg (String[] B,int T) {
        for(int o=0; o<T; o++){
            System.out.print(decodeWord(B[o])+" ");
        }
    }
}
public class EnDecoder2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String[] word = new String[K+1];
        for(int p=1; p<=K; p++){
            word[p] = scan.next();
        }
        int[] codeword = new int[K+1];
        for(int p=1; p<=K; p++){
            codeword[p] = scan.nextInt();
        }
        Decoder Decode = new Decoder(word,codeword);

        final int T = scan.nextInt();
        String[] search = new String[T+1];
        for(int p=0; p<T; p++){
            search[p] = scan.next();
        }
        /* เรียกใช้เครื่องมือ decodeMsg ได้เลยเพราะเราให้เครื่องมือ
         * decodeWord ไว้ใน decodeMsg แล้วนั้นเอง
        */
        Decode.decodeMsg(search,T);
    }
}
/* 5
PIKACHU RAICHU ARBOK TORNADO TYPHOON
3 2 88 99 4
8
PIKASUKE ARBOK RAICHU THAIPOON RAICHU PIKACHU TND ARBOK
 * 
 */