package com.mycompany.arrayexploration1;

import java.util.Scanner;

class FieldManager {

    public int reserveBed;
    public int discharge;
    public int reportBed;
}

public class FieldHospital {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bed = scan.nextInt();
        int x = scan.nextInt();
        int[] arrey = new int[bed + 1];
        FieldManager Manager = new FieldManager();
        for (int i = 1; i <= bed; i++) {
            arrey[i] = 0;
        }
        for (int i = 0; i < x; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int count=0;
            if (a == 1) {
                for (int j = 1; j <= bed; j++) {
                    if (arrey[j] == 0) {
                        Manager.reserveBed = j;
                        arrey[j]+=1;
                        System.out.printf("Bed %d reserved\n", Manager.reserveBed);
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.printf("No bed vacancy\n");
                }
            } else if (a == 2) {
                if (arrey[b] > 0) {
                    System.out.printf("Patient discharged\n");
                    arrey[b] -= 1;
                } else if (arrey[b] == 0) {
                    System.out.printf("Invalid bed number\n");
                }
            } else if (a == 3) {
                for (int j = 1; j <= bed; j++) {
                    if (arrey[j] == 1) {
                        Manager.reportBed += 1;
                    }
                }
                System.out.printf("%d\n", Manager.reportBed);
                Manager.reportBed = 0 ;
            }
        }
    }
}
