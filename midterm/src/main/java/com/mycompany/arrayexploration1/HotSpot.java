package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class HotSpot {

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
        int max=0;
        int count=0;
        int sum=0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                    if(arrey[i][j]==x){
                        count-=1;
                    }
                    for(int k=1; k<=c; k++){
                        if(arrey[i][k]==x){
                            count++;
                        }
                    }
                    for(int g=1; g<=r; g++){
                        if(arrey[g][j]==x){
                            count++;
                        }
                    }
                if(count>max){
                    max=count;
                    sum=1;
                }
                else if(count==max){
                    sum++;
                }
                count=0;
            }
        }
        System.out.printf("%d\n%d\n", max,sum);
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                    if(arrey[i][j]==x){
                        count-=1;
                    }
                    for(int k=1; k<=c; k++){
                        if(arrey[i][k]==x){
                            count++;
                        }
                    }
                    for(int g=1; g<=r; g++){
                        if(arrey[g][j]==x){
                            count++;
                        }
                    }
                if(count==max){
                    System.out.printf("%d %d",i,j);
                    System.out.println();
                }
                count=0;
            }
        }
    }
}
