package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class ColumnSummary {

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
        int sum=0;
        for(int i=1; i<=c; i++){
            int count=0;
            for(int j=1; j<=r; j++){
                if(arrey[j][i]==x){
                    count++;
                    sum++;
                }
            }
            if(count>0){
                System.out.printf("%d ",count);
            }
            else if(count == 0){
                System.out.printf("* ");
            }
        }
        System.out.println("");
        System.out.printf("%d ",sum);
    }
}
