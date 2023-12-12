package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class OnlyOne1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r + 1][c + 1];
        int max = 0;
        int colum = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int x = scan.nextInt();
                arrey[i][j] = x;
            }
        }
        for (int i = 1; i <= c; i++) {
            int count = 0;
            for (int j = 1; j <= r; j++) {
                if (arrey[j][i] == 1) {
                    count++;
                }
            }
            if (count >= max) {
                max = count;
                colum = i;
            }
        }
        System.out.println(max);
        System.out.println(colum);
    }
}
