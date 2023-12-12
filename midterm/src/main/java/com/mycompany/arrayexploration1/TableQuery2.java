package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class TableQuery2 {

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
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (a<=0){
            a=1;
        }
        if(b<=0){
            b=1;
        }
        if(x<=0){
            x=1;
        }
        if(y<=0){
            y=1;
        }
        if(a>r){
            a=r;
        }
        if(b>r){
            b=r;
        }
        if(x>c){
            x=c;
        }
        if(y>c){
            y=c;
        }
        for(int i=a; i<=b; i++){
            for(int j=x; j<=y; j++){
                System.out.printf("%d ", arrey[i][j]);
            }
            System.out.println();
        }
    }
}
//5 7 1 0 2 3 8 9 1 2 1 0 2 3 5 6 1 3 2 5 6 2 0 9 3 8 2 0 3 4 7 9 0 3 5 6 2 1 3 2 5
