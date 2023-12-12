/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class CharInRange2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] A = new String[3];
        String[] B = new String[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scan.next();
            B[i] = scan.next();
        }
        int yes = 0;
        int no = 0;
        int sum = 0;
        String Q = scan.next();
        int length = Q.length();
        for (int i = 0; i < length; i++) {
            int sumQ = (int) Q.charAt(i);
            int count = 0;
            for (int j = 0; j < 3; j++) {
                char a = A[j].charAt(0);
                int sumA = (int) a;
                char b = B[j].charAt(0);
                int sumB = (int) b;
                if (sumQ <= sumA && sumQ >= sumB) {
                    yes++;
                    count++;
                    break;
                } else if (sumA <= sumB) {
                    if (sumQ >= sumA && sumQ <= sumB) {
                        yes++;
                        count++;
                        break;
                    }
                }
            }
            if (count == 0) {
                no++;
            }
        }
        ////////////////////////////////////////////////////////////////
        for (int i = 0; i < length; i++) {
            int sumQ = (int) Q.charAt(i);
            for (int j = 0; j < 3; j++) {
                char a = A[j].charAt(0);
                int sumA = (int) a;
                char b = B[j].charAt(0);
                int sumB = (int) b;
                if (sumQ >= sumA && sumQ <= sumB || sumQ <= sumA && sumQ >= sumB) {
                    sum += 1;
                }
            }
        }
        System.out.println(yes);
        System.out.println(no);
        System.out.println(sum - (no * 2));
    }
}

