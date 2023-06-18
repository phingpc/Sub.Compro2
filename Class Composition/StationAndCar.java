
import java.util.Scanner;

class Station {

    int bensin;
    int Desel;

    public Station(int bensin, int Desel) {
        this.bensin = bensin;
        this.Desel = Desel;
    }

    void dispense(Car c) {
        if (c.gasType == 1) {
            if(bensin - c.getNeededVol() >= 0){
                bensin -= c.getNeededVol();
                System.out.println("Dispense "+c.getNeededVol()+" liters of benzin");
            } else {
                System.out.println("Dispense "+bensin+" liters of benzin");
                bensin = 0;
            }
        } else if (c.gasType == 2) {
            if(Desel - c.getNeededVol() >= 0){
                Desel -= c.getNeededVol();
                System.out.println("Dispense "+c.getNeededVol()+" liters of diesel");
            } else {
                System.out.println("Dispense "+Desel+" liters of diesel");
                Desel = 0;
            }
        }
    }

    void refillBenzin(int A) {
        bensin += A;
        System.out.println("Station has " + bensin + " liters of benzin");
    }

    void refillDiesel(int A) {
        Desel += A;
        System.out.println("Station has " + Desel + " liters of diesel");
    }
}

class Car {

    int gasType;
    int storage;
    int usestorage;
    public Car (int gasType,int storage,int usestorage) {
        this.gasType = gasType;
        this.storage = storage;
        this.usestorage = usestorage;
    }
    int getNeededVol() {
        int Un = storage - usestorage;
        return Un;
    }
}

public class StationAndCar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station station = new Station(benzin, diesel);
        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            if(A == 1){
                Car car = new Car(B, C, D);
                station.dispense(car);
            } else if(A == 2){
                if(B == 1){
                    station.refillBenzin(C);
                } else {
                    station.refillDiesel(C);
                }
            }
            
        }
    }
}
