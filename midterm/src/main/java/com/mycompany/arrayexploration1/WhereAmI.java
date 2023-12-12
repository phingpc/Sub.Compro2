package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class WhereAmI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arrey[i][j]=scan.nextInt();
            }
        }
        int x = scan.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(arrey[i][j]==x){
                    System.out.printf("%d ",x);
                }
                else {
                    System.out.printf("* ");
                }
            }
            System.out.println("");
        }
    }
}
