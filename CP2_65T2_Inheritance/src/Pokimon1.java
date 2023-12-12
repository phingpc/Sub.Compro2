/*
import java.util.Scanner;

class PokiStats {

    int[] hps;
    int[] attks;
    int[] defends;
    int level;

    public PokiStats(int[] hps, int[] attks, int[] defends) {
        this.hps = new int[hps.length];
        this.attks = new int[attks.length];
        this.defends = new int[defends.length];
        for(int i = 1 ; i<this.hps.length; i++){
            this.hps[i] = hps[i];
            this.attks[i]= attks[i];
            this.defends[i]=defends[i];
        }
    }
}

public class Pokimon1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PokiStats[] poki = new PokiStats[N];
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        for (int i = 0; i < N; ++i) {
            for (int level = 1; level <= 5; ++level) {
                hps[level] = scan.nextInt();
            }
            for (int level = 1; level <= 5; ++level) {
                attks[level] = scan.nextInt();
            }
            for (int level = 1; level <= 5; ++level) {
                defends[level] = scan.nextInt();
            }

            poki[i] = new PokiStats(hps, attks, defends);
        }
        for (int i = 0; i < N; ++i) {
            PokiStats p = poki[i];
            for (int level = 1; level <= 5; ++level) {
                System.out.print(p.hps[level] + " ");
            }
            System.out.println();

            for (int level = 1; level <= 5; ++level) {
                System.out.print(p.attks[level] + " ");
            }
            System.out.println();

            for (int level = 1; level <= 5; ++level) {
                System.out.print(p.defends[level] + " ");
            }
            System.out.println();
        }
    }
}
