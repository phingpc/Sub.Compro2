
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String spell = "ABCDEFGH";
        int[] arrey = new int[8+1];
        for(int i=0; i<8; i++){
            arrey[i]=0;
        }
        int length = str.length();
        for(int i=0; i<length; i++){
            int word = (int) str.charAt(i);
            for(int j=0; j<8; j++){
                int spellforword = (int) spell.charAt(j);
                if(word == spellforword){
                    arrey[j]+=1;
                }
            }
        }
        for(int i=0; i<8; i++){
            System.out.printf("%d ", arrey[i]);
        }
    }
}
