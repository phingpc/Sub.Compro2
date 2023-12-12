
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
    int level;
    int energy;
    PokiStats state;

    public Pokimon(PokiStats state, String name, int level) {
        this.state = state;
        this.name = name;
        this.level = level;
        this.energy = state.hps[level];
    }

    int attack() {
        return state.attks[level];
    }

    int defend() {
        return state.defends[level];
    }
}

class WaterPokimon extends Pokimon {
   public WaterPokimon (PokiStats state){
       
   }

}

class FirePokimon extends Pokimon {
}

class ElectricPokimon extends Pokimon {
}

public class Pokemon3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        // Read PokiStats
        for (int t = 1; t <= 3; ++t) {
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
            if (t == 1) {
                water = new WaterPokimon(stats, name, level);
            } else if (t == 2) {
                fire = new FirePokimon(stats, name, level);
            } else if (t == 3) {
                electric = new ElectricPokimon(stats, name, level);
            }
        }

        // Write output
        System.out.println(water.attack(water) + " "+ water.attack(fire) + " "+ water.attack(electric));
        System.out.println(fire.attack(water) + " "+ fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " "+ electric.attack(fire) + " "+ electric.attack(electric));

    }
