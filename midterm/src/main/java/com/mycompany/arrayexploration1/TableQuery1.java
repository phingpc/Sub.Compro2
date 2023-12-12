package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class TableQuery1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int x = scan.nextInt();
                arrey[i][j] = x;
            }
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 1) {
            if (b == 0 | b > r) {
                System.out.printf("invalid Q");
            } else {
                for (int i = 1; i <= c; i++) {
                    System.out.printf("%d ", arrey[b][i]);
                }
            }

        } else if (a == 2) {
            if (b == 0 | b > c) {
                System.out.printf("invalid Q");
            } else {
                for (int i = 1; i <= r; i++) {
                    System.out.println(arrey[i][b]);
                }
            }
        }
    }
}
