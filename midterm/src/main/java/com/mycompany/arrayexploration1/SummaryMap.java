package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class SummaryMap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r+1][c+1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arrey[i][j] = 0;
            }
        }
        int x = scan.nextInt();
        for (int i = 0; i < x*2 ; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int A=a-1;
            int B=b-1;
            if(A>=0 && B>=0 && A<r &&B<c){
                if(arrey[A][B]==0){
                arrey[A][B]+=1;
            }
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
