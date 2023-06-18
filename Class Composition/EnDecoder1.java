import java.util.Scanner;

class Encoder {
    String[] words;
    int[] inputword;
    public Encoder (String[] words,int[] inputword) {
        this.words = words ;
        this.inputword = inputword ;
    }
    /* ไม่มีการเรียกใดๆเป็นเพียงแค่ตัวช่วยในการหาคำใน encodeMsg เท่านั้น!! */
    private int encodeWord (String search) {
        for(int p=1; p<=words.length-1; p++){
            if(this.words[p].equals(search)){
                return inputword[p]; // หาเจอแล้วหยุดการทำงานทันที
            }
        }
        return -1 ; // หาไม่เจอเลย จึงreturn -1 แทน(โจทย์กำหนด)


        /* การ return นั้นไม่จำเป็นต้องอยู้ใน if และต่อด้วย else
         * เพียงอย่างเดียวเพราะว่าการทำงานของ return คลายกับ break
         * แตกต่างเพียงแค่ return จะคืนค่าก่อนแล้วจึงหยุดการทำงาน
         */

    }
    void encodeMsg (String[] search,int T){
        for(int o=0; o<T; o++){
            System.out.print(encodeWord(search[o])+" ");
        }
    }
}
public class EnDecoder1 {
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
        Encoder code = new Encoder(word,codeword);

        final int T = scan.nextInt();
        String[] search = new String[T+1];
        for(int p=0; p<T; p++){
            search[p] = scan.next();
        }
        /* เรียกใช้เครื่องมือ encodeMsg ได้เลยเพราะเราให้เครื่องมือ
         * encodeWord ไว้ใน encodeMsg แล้วนั้นเอง
        */
        code.encodeMsg(search,T);
    }
}

/*5
PIKACHU RAICHU ARBOK TORNADO TYPHOON
3 2 88 99 4
8
PIKASUKE ARBOK RAICHU THAIPOON RAICHU PIKACHU TND ARBOK */