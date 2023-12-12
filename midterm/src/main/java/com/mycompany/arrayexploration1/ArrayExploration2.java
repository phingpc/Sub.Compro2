package com.mycompany.arrayexploration1;


import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arrey = new int[r+1][c+1];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arrey[i][j]=scan.nextInt();
            }
        }
        int  x = scan.nextInt();
        int plus=0;
        int subtract=0;
        int even=0;
        int odd=0;
        int back=0;
        int eveni=0;
        for(int i=0; i<x; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a<=r && b<=c && a>0 && b>0){
                a--;
                b--;
                if(arrey[a][b]>0){
                    plus++;
                    back=1;
                    if(arrey[a][b]%2==0){
                        even++;
                        eveni=1;
                    }
                    else {
                        odd++;
                        eveni=-1;
                    }
                }
                else if (arrey[a][b]<0) {
                    subtract++;
                    back=-1;
                    if(arrey[a][b]%2==0){
                        even++;
                        eveni=1;
                    }
                    else {
                        odd++;
                        eveni=-1;
                    }
                }else if (arrey[a][b]==0){
                    even++;
                    back=0;
                    eveni=1;
                }
            }
            else {
                a--;
                b--;
                if(back==-1){
                    subtract++;
                }
                else if (back==1){
                    plus++;
                }
                if(eveni==1){
                        even++;
                    }
                    else {
                        odd++;
                    }
            }
        }
        System.out.printf("%d %d %d %d",plus,subtract,even,odd);
    }
}
