package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class AtoZ1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int first = 0;
        int go = 0;
        int back=0;
        for (int i = 0; i < length; i++) {
            int value = (int) str.charAt(i);
            if (value == 90) {
                first = 90;
                go = i;
                for (int j = 0; j < length; j++) {
                    int value2 = (int) str.charAt(j);
                    if (value2 == 65) {
                        back = j;
                        break;
                    }
                }
                break;
            }
            if (value == 65) {
                first = 65;
                go = i;
                for (int j = 0; j < length; j++) {
                    int value2 = (int) str.charAt(j);
                    if (value2 == 90) {
                        back = j;
                        break;
                    }
                }
                break;
            } 
        }
        if (first == 65) {
            for (int i = go; i <= back; i++) {
                int value = (int) str.charAt(i);
                    System.out.print(str.charAt(i));
            }
        } else if (first == 90) {
            for (int i = back ; i >= go; i--) {
                int value = (int) str.charAt(i);
                System.out.print(str.charAt(i));
            }
        }
    }
}
