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
        for (int i = 1; i < this.hps.length; i++) {
            this.hps[i] = hps[i];
            this.attks[i] = attks[i];
            this.defends[i] = defends[i];
        }
    }
}

class Pokimon {
    String name;
    int level ;
    int energy ;
    PokiStats state;
    public Pokimon(PokiStats state,String name,int level){
        this.state = state;
        this.name = name;
        this.level = level;
        this.energy = state.hps[level];
    }
     int attack(){
         return state.attks[level];
     }
     int defend(){
         return state.defends[level];
     }
}

public class Pokemon2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        // Read PokiStats
        for (int level = 1; level <= 5; ++level) {
            hps[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; ++level) {
            attks[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; ++level) {
            defends[level] = scan.nextInt();
        }
        PokiStats stats = new PokiStats(hps, attks, defends);

        // Name, level and object creation
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);

        // Write output
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());
    }
}
