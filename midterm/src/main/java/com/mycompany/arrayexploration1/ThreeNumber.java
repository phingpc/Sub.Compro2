
package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        if(x==1){
            if(a>=b && a>=c){
                System.out.printf("%d",a);
            }
            else if(b>=a && b>=c){
                System.out.printf("%d",b);
            }
            else if(c>=a && c>=b){
                System.out.printf("%d",c);
            }
        }else if(x==-1){
            if(a<=b && a<=c){
                System.out.printf("%d",a);
            }
            else if(b<=a && b<=c){
                System.out.printf("%d",b);
            }
            else if(c<=a && c<=b){
                System.out.printf("%d",c);
            }
        }else if (x==0){
            if(a>=b && a<=c || a>=c && a<=b){
                System.out.printf("%d",a);
            }
            else if(b>=a && b<=c || b>=c && b<=a){
                System.out.printf("%d",b);
            }
            else if(c>=a &&c<=b || c>=b&&c<=a){
                System.out.printf("%d",c);
            }
        }
    }
}
