
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class ShootingString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int fight = (int) a.charAt(0);
        while(true){
            String b = scan.next();
            int lengthB = b.length();
            int count=0;
            int end = (int) b.charAt(0);
            if(lengthB == 1 && end == 90){
                break;
            }
            for(int i=0; i<lengthB; i++){
                int defent = (int) b.charAt(i);
                if(fight == defent){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
