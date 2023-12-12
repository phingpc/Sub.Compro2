package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class OnlyOne3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r + 1][c + 1];
        int max = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int x = scan.nextInt();
                arrey[i][j] = x;
            }
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a<=0){
            a=1;
        }
        if(a>r){
            a=r;
        }
        if(b<=0){
            b=1;
        }
        if(b>c){
            b=c;
        }
        
        for(int i=1; i<=c; i++){
            if(arrey[a][i]==1){
                max++;
            }
        }
        
        for(int i = 1; i<=r; i++){
            if(arrey[i][b]==1){
                max++;
            }
        }
        if(arrey[a][b]==1){
            max-=1;
        }
        System.out.println(max);

    }
}
