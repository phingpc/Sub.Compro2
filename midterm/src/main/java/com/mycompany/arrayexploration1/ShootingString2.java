
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class ShootingString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int fight = (int) a.charAt(0);
        int sumA=0;
        int sumB=0;
        int total=0;
        int count=0;
        while(true){
            String b = scan.next();
            int lengthB = b.length();
            int end = (int) b.charAt(0);
            if(lengthB == 1 && end == 90){
                break;
            }
            for(int i=0; i<lengthB; i++){
                int defent = (int) b.charAt(i);
                if(fight == defent){
                    sumA++;
                }
                count++;
            }
        }
        int countB=0;
        String c = scan.next();
        int fight2 = (int) c.charAt(0);
        while(true){
            String b = scan.next();
            int lengthB = b.length();
            int end = (int) b.charAt(0);
            if(lengthB == 1 && end == 90){
                break;
            }
            for(int i=0; i<lengthB; i++){
                int defent = (int) b.charAt(i);
                if(fight2 == defent){
                    sumB++;
                }
                countB++;
            }
        }
        System.out.printf("%d %d %d",sumA,countB/5,sumA+(countB/5));
        System.out.println();
        System.out.printf("%d %d %d",sumB,count/5,sumB+(count/5));
        System.out.println();
        if(sumA+(countB/5)>sumB+(count/5)){
            System.out.printf("1");
        }else {
            System.out.printf("2");
        }
    }
}
