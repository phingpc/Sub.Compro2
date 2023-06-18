import java.util.Scanner;
class GasStation {
    double[] amount ;
    Truck[] tuk;
    public GasStation (double[] amount,Truck[] tuk) {
        this.amount = amount;
        this.tuk = tuk ;
    }
    void fillTank (int gas_target,int Truck,double distance) {
        if(amount[gas_target-1] - tuk[Truck-1].calFuel(distance) < 0){
            amount[gas_target-1] = 0 ;
            System.out.println(gas_target+" out of gasoline");
        } else {
            amount[gas_target-1] -= tuk[Truck-1].calFuel(distance) ;
        }
    }
    void refuel (double[] A){
        for(int p=0; p<amount.length-1; p++){
            amount[p] += A[p];
        }
    }
    void print () {
        for(int p=0; p<amount.length-1; p++){
            System.out.print(amount[p]+" ");
        }
        System.out.println();
    }
}

class Truck {

    int weight;
    int amount;

    public Truck(int weight, int amount) {
        this.weight = weight;
        this.amount = amount;
    }

    double calFuel(double distance) {
        double x = (distance + weight) ;
        x = x/10;// (กูไม่เข้าใจว่าทำไมหารใน double x เลยไม่ได้)
        return Math.ceil(x); //ปัดทศนิยมขึ้น
    }
}
public class TestGasStation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nTruck = scan.nextInt();
        Truck[] t = new Truck[nTruck + 1];
        for(int p=0; p<nTruck; p++){
            int weight = scan.nextInt();
            int amount = scan.nextInt();
            t[p] = new Truck(weight, amount);
        }
        int nGasStation = scan.nextInt();
        double[] amount_gas = new double[nGasStation+1];
        for(int p=0; p<nGasStation; p++){
            amount_gas[p] = scan.nextInt();
        }
        GasStation gas = new GasStation (amount_gas,t) ;


        int A = scan.nextInt();
        double[] gasonly = new double[nGasStation+1];
        for(int p=0; p<A; p++){
            int target = scan.nextInt();
            if(target == 0){
                int tuk_target = scan.nextInt();
                int gas_target = scan.nextInt();
                double distance_target = scan.nextInt();
                gas.fillTank(gas_target, tuk_target, distance_target);
                gas.print();
            } else {
                for(int k=0; k<nGasStation; k++){
                    gasonly[k] = scan.nextInt();
                }
                gas.refuel(gasonly);
                gas.print();
            }
        }
    }
}  
