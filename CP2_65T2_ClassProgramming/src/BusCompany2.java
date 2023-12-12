
/*import java.util.Scanner;

class Bus {

    public String id;
    public int type;
    public int seats;
    public int curSeats = 0;
    public boolean state = true;

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.curSeats = 0;
    }

    public void printStats() {
        System.out.println(this.id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.printf("%d %d\n", curSeats, seats);
        if(state == true){
            System.out.println("Active");
        } else if (state == false){
            System.out.println("Inactive");
        }
    }

    public void reserve(int K) {
        if(state == true){
            if(K+curSeats <= seats){
            if(K>=0){
                curSeats+=K;
            }
        }
        }
    }

    public void sendToRepair() {
        state = false ;
    }

    public void backToService() {
        state = true;
    }
}

public class BusCompany2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        int a = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        for (int i = 1; i <= a; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                b.reserve(K);
            } else if (P == 2) {
                b.sendToRepair();
            } else if (P == 3) {
                b.backToService();
            }
            b.printStats();

        }
    }
}
