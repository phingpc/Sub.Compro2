package com.mycompany.arrayexploration1;

import java.util.ArrayList;
import java.util.Scanner;

class Route {

    public String names;
    public int distances;
}

public class BusRoute1 {
    public ArrayList<Route> routegod = new ArrayList<Route>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route rou = new Route();
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int x = scan.nextInt();
            if(x<=N && x>0){
                System.out.printf("%s %d",names[x],distances[x]);
                System.out.println("");
            } else {
                System.out.println("invalid number");
            }
        }
    }
}
