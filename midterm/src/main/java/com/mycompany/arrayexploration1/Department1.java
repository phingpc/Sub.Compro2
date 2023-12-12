package com.mycompany.arrayexploration1;

import java.util.Scanner;
import java.util.ArrayList;

class Dept {

    public int ministry;
    public int education;
    public int service = 300000;
    public int donation = 100000;
}

public class Department1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        Dept d = new Dept();
        d.ministry += x*500000 + y*3000;
        d.education += y*5000;
        System.out.printf("ministry budget = %d\n",d.ministry);
        System.out.printf("education fee = %d\n",d.education);
        System.out.printf("service fee = %d\n",d.service);
        System.out.printf("donation = %d\n",d.donation);
    }
}
