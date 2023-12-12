package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class Subregion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arrey[i][j] = 0;
            }
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (a <= 0 || a > r || b <= 0 || b > c) {
            System.out.printf("invalid input");
        }
        else if (a + x - 1>r || b - 1 + y > c){
            System.out.printf("invalid input");
        }
        else {
            for (int i = a - 1; i < a + x - 1; i++) {
                for (int j = b - 1; j < b - 1 + y; j++) {
                    arrey[i][j] = 1;
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.printf("%d ", arrey[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
// 8 7 3 2 4 5
