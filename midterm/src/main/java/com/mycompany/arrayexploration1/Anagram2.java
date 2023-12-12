
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = scan.next();
        String spell = "ABCDEFGH";
        int[] arrey = new int[8+1];
        int[] arrey2 = new int[8+1];
        int[] arrey3 = new int[8+1];
        int count=0;
        for(int i=0; i<8; i++){
            arrey[i]=0;
            arrey2[i]=0;
            arrey3[i]=0;
        }
        int length = str.length();
        int length2 = str2.length();
        for(int i=0; i<length; i++){
            int word = (int) str.charAt(i);
            for(int j=0; j<8; j++){
                int spellforword = (int) spell.charAt(j);
                if(word == spellforword){
                    arrey[j]+=1;
                }
            }
        }
        for(int i=0; i<length2; i++){
            int word = (int) str2.charAt(i);
            for(int j=0; j<8; j++){
                int spellforword = (int) spell.charAt(j);
                if(word == spellforword){
                    arrey2[j]+=1;
                }
            }
        }
        for(int i=0; i<8; i++){
            System.out.printf("%d ", arrey[i]);
        }
        System.out.println();
        for(int i=0; i<8; i++){
            System.out.printf("%d ", arrey2[i]);
        }
        System.out.println();
        for(int i=0; i<8; i++){
            if(arrey[i]>arrey2[i]){
                arrey3[i]=arrey[i]-arrey2[i];
            }
            else {
                arrey3[i]=arrey2[i]-arrey[i];
            }
            System.out.printf("%d ",arrey3[i]);
            if(arrey3[i]>0){
                count++;
            }
        }
        System.out.println();
        if(count>3){
            System.out.printf("no");
        }else {
            System.out.printf("anagram");
        }
    }
}
