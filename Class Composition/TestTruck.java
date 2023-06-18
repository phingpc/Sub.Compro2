import java.util.Scanner;

class Truck {

    int weight;
    int amount;

    public Truck(int weight, int amount) {
        this.weight = weight;
        this.amount = amount;
    }

    double calFuel(int distance) {
        double x = (distance + weight) ;
        x = x/10;// (กูไม่เข้าใจว่าทำไมหารใน double x เลยไม่ได้)
        return Math.ceil(x); //ปัดทศนิยมขึ้น
    }
}

public class TestTruck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(in.nextInt(), in.nextInt());
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int distance = in.nextInt();
            //call method and show the answer
            System.out.println(t[x-1].calFuel(distance));
        }
    }
}
