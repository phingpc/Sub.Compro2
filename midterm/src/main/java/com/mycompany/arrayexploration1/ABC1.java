package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class ABC1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            int value1 = (int) str.charAt(i);
            if (i + 1 < length) {
                int value2 = (int) str.charAt(i + 1);
                if (i + 2 < length) {
                    int value3 = (int) str.charAt(i + 2);
                    if (value1 == value2 - 1 && value1 == value3 - 2) {
                        count++;
                    }
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }
        System.out.printf("%d", count);
    }
}
